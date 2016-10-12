/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template inputFile, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.listaimoveis;

//<editor-fold defaultstate="collapsed" desc="Importações">

import java.util.ArrayList;
import java.util.List;
import org.unipampa.rp2.tiposimoveis.Imovel;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.unipampa.rp2.tiposimoveis.SalaComercial;

//</editor-fold>

/**
 *
 * @author yuryalencar
 */
public class Lista implements ListaImoveis {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private List<Imovel> lista = new ArrayList();
    private final String tipo;
    
    //</editor-fold>
       
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    
    /**
     * Construtor que pega qual o tipo
     * para criar um arquivo a partir do
     * mesmo
     * @param tipo - String nome que será gravado o .csv
     */
    public Lista(String tipo){
        this.tipo = tipo;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Implementados">
    
    //<editor-fold defaultstate="collapsed" desc="Listas(Incluir, Editar, Excluir e Consultar)">
    
    /**
     * Método para que se possa cadastrar um imóvel
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
     * @param codigo - valor inteiro, sendo que este terá que ser igual a o de 
     * algum imóvel para ser acessado
     * @return - retorna um objeto do tipo imóvel, caso através do cógido algum 
     * seja encontrado.
     */
    @Override
    public Imovel consultar(int codigo) {
        
        for (Imovel imovel : lista) {
            if(codigo == imovel.getCod()){
                return imovel;
            }
        }
        
        return null;
    }

    /**
     * Método para a exclusão de um imóvel a partir
     * do código
     * @param codigo - inteiro:tipo (Código do imóvel a
     * ser excluído)
     * @return - true caso tenha sido excluído com sucesso
     * ou false caso contrário.
     */
    @Override
    public boolean excluir(int codigo) {
        for (Imovel imovel : lista) {
            if(imovel.getCod() == codigo){
                lista.remove(imovel);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Método para editar um arquivo a partir do código
     * @param codigo - código do tipo inteiro para a pesquisa
     * de qual imovel editar
     * @param im - novo imóvel com os dados modifcados no qual
     * será trocado pelo antigo
     * @return - true caso tenha sido editado com sucesso, ou 
     * false caso contrário
     */
    @Override
    public boolean editar(int codigo, Imovel im) {
        for (Imovel imovelAnterior : lista) {
            if(imovelAnterior.getCod() == codigo){
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
     * @return - true caso tenha sido gravado com sucesso ou false
     * caso contrário.
     */
    @Override
    public boolean escreverArquivo() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+System.getProperty("file.separator")+this.tipo+".csv"));
        
            for (Imovel imovel : lista) {
                bw.write(imovel.writeFile());
            }
            
            bw.close();
            
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * Método para a leitura de um documento .csv e extração dos seus dados
     * dependentemente do seu tipo.
     * @return - true caso a leitura tenha sido realizada com sucesso, e false
     * caso contrário.
     */
    @Override
    public boolean lerArquivo() {
        File file = new File(System.getProperty("user.dir")+System.getProperty("file.separator")+this.tipo+".csv");
        
        if(file.exists()){
            switch(this.tipo){
                case "SalasComerciais":
                    try {
                        lerSalasComerciais();
                        return true;
                    } catch (Exception ex) {
                        Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "Apartamentos":

                    break;
                case "Casas":

                    break;
                case "Terreno":

                    break;
                case "Chacara":

                    break;
                default:
                    return false;
            }
        }
        return false;
    }

    //<editor-fold defaultstate="collapsed" desc="Método para a leitura de uma sala comercial">
    
    /**
     * Método privado para a leitura de arquivos .csv do tipo sala comercial
     * @throws FileNotFoundException
     * @throws IOException 
     */
    private void lerSalasComerciais() throws FileNotFoundException, IOException{
        String line, logradouro="", nomeEdificio="", descricao="", bairro="", cidade="", convert ="";
        int cod = 0, numero = 0, andar = 0, nroSala = 0, nroBanheiros = 0, aux = 0;
        double valor = 0, areaTotal = 0, valorCondominio = 0;
        
        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+System.getProperty("file.separator")+this.tipo+".csv"));
        
        do{
            line = br.readLine();
            
            if(line != null){
                for (int i = 0; i < line.length(); i++) {
                    if(line.charAt(i) == ';'){
                        
                        //<editor-fold defaultstate="collapsed" desc="Switch">
                        switch (aux){
                            case 0:
                                cod = Integer.parseInt(convert);
                                break;
                            case 1:
                                numero = Integer.parseInt(convert);
                                break;
                            case 2:
                                areaTotal = Double.parseDouble(convert);
                                break;
                            case 3:
                                valor = Double.parseDouble(convert);
                                break;
                            case 4:
                                logradouro = convert;
                                break;
                            case 5:
                                bairro = convert;
                                break;
                            case 6:
                                cidade = convert;
                                break;
                            case 7:
                                descricao = convert;
                                break;
                            case 8:
                                nroBanheiros = Integer.parseInt(convert);
                                break;
                            case 9:
                                andar = Integer.parseInt(convert);
                                break;
                            case 10:
                                nroSala = Integer.parseInt(convert);
                                break;
                            case 11:
                                valorCondominio = Double.parseDouble(convert);
                                break;
                            case 12:
                                nomeEdificio = convert;
                                break;
                        }
                        //</editor-fold>
                        
                        convert = "";
                        aux ++;
                    } else {
                        convert += line.charAt(i);
                    }
                }
                
                SalaComercial sala = new SalaComercial(cod, numero, areaTotal, valor,logradouro,
                    bairro, cidade, descricao, nroBanheiros, andar, nroSala, valorCondominio, nomeEdificio);
                    
                aux = 0;
                this.lista.add(sala);
            }
            
        }while(line != null);
        
        br.close();
    }
    
    //</editor-fold>
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Arquivos Extras (Gerenciamento do Código)">
    
    /**
     * Método para sempre atualizar o último código onde assim com isto
     * poderemos toda vez que iniciar o programar começar do mesmo código que
     * paramos
     * @param cod - ultimo código a ser adicionado (Necessita ser gravado toda
     * inclusão)
     * @throws IOException 
     */
    public void gravarUltimoCod(int cod) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+System.getProperty("file.separator")+"lastCod.txt"));
        
        bw.write(String.valueOf(cod));
        
        bw.close();
    }
    
    /**
     * Método para sempre atualizar o último código onde assim com isto
     * poderemos toda vez que iniciar o programar começar do mesmo código que
     * paramos
     * @throws IOException 
     */
    public void startCodigo() throws IOException{
        File inputFile = new File(System.getProperty("user.dir")+System.getProperty("file.separator")+"lastCod.txt");

        if(inputFile.exists()){
            BufferedReader br = new BufferedReader(new FileReader(inputFile));

            Imovel.startCodigo(Integer.parseInt(br.readLine()));

            br.close();
        }
    }
    
    //</editor-fold>
    
    //</editor-fold>
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Não implementados">

    @Override
    public List<Imovel> ordenarCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imovel> ordenarValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imovel> ordenarArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imovel> pesquisaValor(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imovel> pesquisaBairro(String bairro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GetLista(Implementado)">
    
    /**
     * Método para retornar a lista de imóveis
     * @return - uma Lista contendo todos o imóveis cadastrados de tal tipo(List)
     */
    public List<Imovel> getLista(){
        return this.lista;
    }

    //</editor-fold>
    
}
