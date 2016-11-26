/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template inputFile, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unipampa.rp2.listaimoveis;

//<editor-fold defaultstate="collapsed" desc="Importações">
import br.edu.unipampa.lista.classe.RPList;
import java.util.ArrayList;
import java.util.List;
import br.edu.unipampa.rp2.tiposimoveis.Imovel;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//</editor-fold>
/**
 *
 * @author yuryalencar
 * @author VitorSantos
 * @author GuilhermeCCamargo
 */
public class Lista implements ListaImoveis {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private List<Imovel> lista = new RPList();
    private final String tipo;

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    /**
     * Construtor que pega qual o tipo para criar um arquivo a partir do mesmo
     *
     * @param tipo - String nome que será gravado o .csv
     */
    public Lista(String tipo) {
        this.tipo = tipo;
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Listas(Incluir, Editar, Excluir e Consultar)">
    /**
     * Método para que se possa cadastrar um imóvel
     *
     * @param im - imóvel a ser incluído dentro da lista
     * @return - true caso consiga ou false caso ocorra algum erro
     */
    @Override
    public boolean incluir(Imovel im) {
        return lista.add(im);
    }

    /**
     * Método que consulta um imóvel através do código caso o imovel não exista
     * é retornado o valor null.
     *
     * @param codigo - valor inteiro, sendo que este terá que ser igual a o de
     * algum imóvel para ser acessado
     * @return - retorna um objeto do tipo imóvel, caso através do cógido algum
     * seja encontrado.
     */
    @Override
    public Imovel consultar(int codigo) {

        for (Imovel imovel : lista) {
            if (codigo == imovel.getCod()) {
                return imovel;
            }
        }

        return null;
    }

    /**
     * Método para a exclusão de um imóvel a partir do código
     *
     * @param codigo - inteiro:tipo (Código do imóvel a ser excluído)
     * @return - true caso tenha sido excluído com sucesso ou false caso
     * contrário.
     */
    @Override
    public boolean excluir(int codigo) {
        for (Imovel imovel : lista) {
            if (imovel.getCod() == codigo) {
                lista.remove(imovel);
                return true;
            }
        }
        return false;
    }

    /**
     * Método para editar um arquivo a partir do código
     *
     * @param codigo - código do tipo inteiro para a pesquisa de qual imovel
     * editar
     * @param im - novo imóvel com os dados modifcados no qual será trocado pelo
     * antigo
     * @return - true caso tenha sido editado com sucesso, ou false caso
     * contrário
     */
    @Override
    public boolean editar(int codigo, Imovel im) {
        for (Imovel imovelAnterior : lista) {
            if (imovelAnterior.getCod() == codigo) {
                int index = lista.indexOf(imovelAnterior);
                lista.set(index, im);
                return true;
            }
        }
        return false;
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Manipulação de Arquivos(Escrever e Ler)">
   
    //<editor-fold defaultstate="collapsed" desc="Arquivos padrões">
    /**
     * Método para escrever dentro de um documento no formato .csv
     *
     * @return - true caso tenha sido gravado com sucesso ou false caso
     * contrário.
     */
    @Override
    public boolean escreverArquivo() {
        try {
            ObjectOutputStream bOs = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir") + System.getProperty("file.separator") + this.tipo + ".bin"));
            bOs.writeObject(this.lista);
            bOs.close();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * Método para a leitura de um documento .csv e extração dos seus dados
     * dependentemente do seu tipo.
     *
     * @return - true caso a leitura tenha sido realizada com sucesso, e false
     * caso contrário.
     */
    @Override
    public boolean lerArquivo() {
        File file = new File(System.getProperty("user.dir") + System.getProperty("file.separator") + this.tipo + ".bin");

        if (file.exists()) {
            try {
                ObjectInputStream bIs = new ObjectInputStream(new FileInputStream(file));
                this.lista = (List<Imovel>)bIs.readObject();
                bIs.close();
                return true;
            } catch (Exception ex) {
                Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        return false;
    }

    //<editor-fold defaultstate="collapsed" desc="Arquivos Extras (Gerenciamento do Código)">
    /**
     * Método para sempre atualizar o último código onde assim com isto
     * poderemos toda vez que iniciar o programar começar do mesmo código que
     * paramos
     *
     * @param cod - ultimo código a ser adicionado (Necessita ser gravado toda
     * inclusão)
     * @throws IOException
     */
    public void gravarUltimoCod(int cod) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + System.getProperty("file.separator") + "lastCod.txt"));

        bw.write(String.valueOf(cod));

        bw.close();
    }

    /**
     * Método para sempre atualizar o último código onde assim com isto
     * poderemos toda vez que iniciar o programar começar do mesmo código que
     * paramos
     *
     * @throws IOException
     */
    public static void startCodigo() throws IOException {
        File inputFile = new File(System.getProperty("user.dir") + System.getProperty("file.separator") + "lastCod.txt");
        int initCod;

        if (inputFile.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));

            initCod = Integer.parseInt(br.readLine());

            br.close();

            Imovel.startCodigo((initCod + 1));
        }
    }

    //</editor-fold>
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Ordenações">
    @Override
    public List<Imovel> ordenarCodigo() {
        //Selection Sort        
        for (int i = 0; i < lista.size() - 1; i++) {
            int index = i;

            for (int j = i + 1; j < lista.size(); j++) {

                if (lista.get(j).getCod() < lista.get(index).getCod()) {
                    index = j;
                }
            }
            Imovel menorcodigo = lista.get(index);
            lista.set(index, lista.get(i));
            lista.set(i, menorcodigo);
        }
        return lista;
    }

    @Override
    public List<Imovel> ordenarValor() {
        //Bubble Sort    
        Imovel auxiliar;

        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size()-1; j++) {
                if (lista.get(j).getValor() > lista.get(j+1).getValor()) {
                    auxiliar = lista.get(j + 1);
                    lista.set(j+1, lista.get(j));
                    lista.set(j, auxiliar);
                }
            }
        }

        return lista;
    }

    @Override
    public List<Imovel> ordenarArea() {

        //Insertion Sort 
        for (int j = 1; j < lista.size(); j++) {
            Imovel auxiliar = lista.get(j);
            int i = j - 1;
            while ((i > -1) && (lista.get(i).getAreaTotal() > auxiliar.getAreaTotal())) {
                lista.set(i + 1, lista.get(i));
                i--;
            }
            lista.set(i + 1, auxiliar);
        }
        return lista;
    }

    //</editor-fold>
    
    //</editor-fold>

    @Override
    public List<Imovel> pesquisaValor(double valor) {
        List<Imovel> listaValor = new RPList();
        for (Imovel imovel : this.lista) {
            if(imovel.getValor() >=  valor){
                listaValor.add(imovel);
            }
        }
        return listaValor;
    }

    @Override
    public List<Imovel> pesquisaBairro(String bairro) {

        List<Imovel> listaBairro = new RPList();
        for (Imovel imovel : this.lista) {
            if(imovel.getBairro().trim().toLowerCase().contains(bairro.toLowerCase().trim())){
                listaBairro.add(imovel);
            }
        }
        return listaBairro;
    }

    //<editor-fold defaultstate="collapsed" desc="GetLista(Implementado)">
    /**
     * Método para retornar a lista de imóveis
     *
     * @return - uma Lista contendo todos o imóveis cadastrados de tal
     * tipo(List)
     */
    public List<Imovel> getLista() {
        return this.lista;
    }

    //</editor-fold>
}
