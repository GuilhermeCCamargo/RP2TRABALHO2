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
import org.unipampa.rp2.tiposimoveis.Apartamento;
import org.unipampa.rp2.tiposimoveis.Casa;
import org.unipampa.rp2.tiposimoveis.SalaComercial;
import org.unipampa.rp2.tiposimoveis.Tipo;
import org.unipampa.rp2.tiposimoveis.Terreno;
import org.unipampa.rp2.tiposimoveis.Chacara;

//</editor-fold>
/**
 *
 * @author yuryalencar
 * @author VitorSantos
 * @author GuilhermeCCamargo
 */
public class Lista implements ListaImoveis {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private List<Imovel> lista = new ArrayList();
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
    //<editor-fold defaultstate="collapsed" desc="Implementados">
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
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + System.getProperty("file.separator") + this.tipo + ".csv"));

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
     *
     * @return - true caso a leitura tenha sido realizada com sucesso, e false
     * caso contrário.
     */
    @Override
    public boolean lerArquivo() {
        File file = new File(System.getProperty("user.dir") + System.getProperty("file.separator") + this.tipo + ".csv");

        if (file.exists()) {
            switch (this.tipo) {
                case "SalasComerciais":
                    try {
                        lerSalasComerciais();
                        return true;
                    } catch (Exception ex) {
                        Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "Apartamentos": {
                    try {
                        lerApartamento();
                        return true;
                    } catch (IOException ex) {
                        Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                case "Casas":
                    try {
                        lerCasas();
                        return true;
                    } catch (Exception ex) {
                        Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "Terrenos":
                    try {
                        lerTerreno();
                        return true;
                    } catch (Exception ex) {
                        Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "Chacaras":
                    try {
                        lerChacara();
                    } catch (IOException ex) {
                        Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                default:
                    return false;
            }
        }
        return false;
    }

    //<editor-fold defaultstate="collapsed" desc="Método para leitura de um Terreno">
    private void lerTerreno() throws FileNotFoundException, IOException {
        int cod = 0, numero = 0;
        double areaTotal = 0, valor = 0, dimensaoFrente = 0, dimensaoLado = 0;
        String logradouro = "", bairro = "", cidade = "", descricao = "", linha = "";
        int aux = 0;
        String convercao = "";

        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + System.getProperty("file.separator") + this.tipo + ".csv"));

        do {
            linha = br.readLine();

            if (linha != null) {
                for (int i = 0; i < linha.length(); i++) {
                    if (linha.charAt(i) == ';') {

                        //<editor-fold defaultstate="collapsed" desc="Switch Terreno">
                        switch (aux) {
                            case 0:
                                cod = Integer.parseInt(convercao);
                                break;
                            case 1:
                                numero = Integer.parseInt(convercao);
                                break;
                            case 2:
                                areaTotal = Double.parseDouble(convercao);
                                break;
                            case 3:
                                valor = Double.parseDouble(convercao);
                                break;
                            case 4:
                                logradouro = convercao;
                                break;
                            case 5:
                                bairro = convercao;
                                break;
                            case 6:
                                cidade = convercao;
                                break;
                            case 7:
                                descricao = convercao;
                                break;
                            case 8:
                                dimensaoFrente = Double.parseDouble(convercao);
                                break;
                            case 9:
                                dimensaoLado = Double.parseDouble(convercao);
                                break;

                        }
                        //</editor-fold>

                        convercao = "";
                        aux++;
                    } else {
                        convercao += linha.charAt(i);
                    }
                }

                Terreno terreno = new Terreno(cod, numero, valor, cidade, descricao,
                        logradouro, areaTotal, bairro, dimensaoFrente, dimensaoLado);

                aux = 0;
                this.lista.add(terreno);
            }

        } while (linha != null);

        br.close();
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Método para leitura de uma Casa">
    private void lerCasas() throws FileNotFoundException, IOException {
        String linha, logradouro = "", bairro = "", cidade = "", descricao = "";
        int cod = 0, numero = 0, NQuartos = 0, NVagasGaragem = 0, anoConstrucao = 0;
        double areaTotal = 0, valor = 0, areaConstruida = 0;
        Tipo tipo = null;
        String convercao = "";
        int aux = 0;

        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + System.getProperty("file.separator") + this.tipo + ".csv"));

        do {
            linha = br.readLine();

            if (linha != null) {
                for (int i = 0; i < linha.length(); i++) {
                    if (linha.charAt(i) == ';') {

                        //<editor-fold defaultstate="collapsed" desc="Switch Casa">
                        switch (aux) {
                            case 0:
                                cod = Integer.parseInt(convercao);
                                break;
                            case 1:
                                numero = Integer.parseInt(convercao);
                                break;
                            case 2:
                                areaTotal = Double.parseDouble(convercao);
                                break;
                            case 3:
                                valor = Double.parseDouble(convercao);
                                break;
                            case 4:
                                logradouro = convercao;
                                break;
                            case 5:
                                bairro = convercao;
                                break;
                            case 6:
                                cidade = convercao;
                                break;
                            case 7:
                                descricao = convercao;
                                break;
                            case 8:
                                tipo = Tipo.verificarTipo(convercao);
                                break;
                            case 9:
                                areaConstruida = Double.parseDouble(convercao);
                                break;
                            case 10:
                                NQuartos = Integer.parseInt(convercao);
                                break;
                            case 11:
                                NVagasGaragem = Integer.parseInt(convercao);
                                break;
                            case 12:
                                anoConstrucao = Integer.parseInt(convercao);
                                break;
                        }
                        //</editor-fold>

                        convercao = "";
                        aux++;
                    } else {
                        convercao += linha.charAt(i);
                    }
                }

                Casa casa = new Casa(cod, numero, areaTotal, valor, logradouro, bairro, cidade,
                        descricao, tipo, areaConstruida, NQuartos, NVagasGaragem, anoConstrucao);

                aux = 0;
                this.lista.add(casa);
            }

        } while (linha != null);

        br.close();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Método para a leitura de um Apartamento">
    private void lerApartamento() throws FileNotFoundException, IOException {
        int cod = 0, numero = 0, nroQuartos = 0, vgsGaragem = 0, nroApartamento = 0, andar = 0, anoConstrucao = 0;
        double areaTotal = 0, valor = 0, valorCondominio = 0;
        String logradouro = "", bairro = "", cidade = "", descricao = "", linha = "", nomeEdificio = "";
        int aux = 0;
        String conversao = "";

        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + System.getProperty("file.separator") + this.tipo + ".csv"));

        do {
            linha = br.readLine();

            if (linha != null) {
                for (int i = 0; i < linha.length(); i++) {
                    if (linha.charAt(i) == ';') {

                        //<editor-fold defaultstate="collapsed" desc="Switch Terreno">
                        switch (aux) {
                            case 0:
                                cod = Integer.parseInt(conversao);
                                break;
                            case 1:
                                numero = Integer.parseInt(conversao);
                                break;
                            case 2:
                                areaTotal = Double.parseDouble(conversao);
                                break;
                            case 3:
                                valor = Double.parseDouble(conversao);
                                break;
                            case 4:
                                logradouro = conversao;
                                break;
                            case 5:
                                bairro = conversao;
                                break;
                            case 6:
                                cidade = conversao;
                                break;
                            case 7:
                                descricao = conversao;
                                break;
                            case 8:
                                nomeEdificio = conversao;
                                break;
                            case 9:
                                anoConstrucao = Integer.parseInt(conversao);
                                break;
                            case 10:
                                nroApartamento = Integer.parseInt(conversao);
                                break;
                            case 11:
                                nroQuartos = Integer.parseInt(conversao);
                                break;
                            case 12:
                                andar = Integer.parseInt(conversao);
                                break;
                            case 13:
                                valorCondominio = Double.parseDouble(conversao);
                                break;

                        }
                        //</editor-fold>

                        conversao = "";
                        aux++;
                    } else {
                        conversao += linha.charAt(i);
                    }
                }

                Apartamento apartamento = new Apartamento(cidade, bairro, logradouro, numero,
                        valor, nomeEdificio, andar, nroApartamento,
                        anoConstrucao, nroQuartos, vgsGaragem, valorCondominio, descricao, areaTotal);

                aux = 0;
                this.lista.add(apartamento);
            }

        } while (linha != null);

        br.close();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Método para a leitura de uma sala comercial">
    /**
     * Método privado para a leitura de arquivos .csv do tipo sala comercial
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    private void lerSalasComerciais() throws FileNotFoundException, IOException {
        String line, logradouro = "", nomeEdificio = "", descricao = "", bairro = "", cidade = "", convert = "";
        String[] dados = null;
        int cod = 0, numero = 0, andar = 0, nroSala = 0, nroBanheiros = 0, aux = 0;
        double valor = 0, areaTotal = 0, valorCondominio = 0;

        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + System.getProperty("file.separator") + this.tipo + ".csv"));

        line = br.readLine();

        while (line != null) {

            dados = line.split(";");
            cod = Integer.parseInt(dados[0]);
            numero = Integer.parseInt(dados[1]);
            areaTotal = Double.parseDouble(dados[2]);
            valor = Double.parseDouble(dados[3]);
            logradouro = dados[4];
            bairro = dados[5];
            cidade = dados[6];
            descricao = dados[7];
            nroBanheiros = Integer.parseInt(dados[8]);
            andar = Integer.parseInt(dados[9]);
            nroSala = Integer.parseInt(dados[10]);
            nomeEdificio = dados[11];
            valorCondominio = Double.parseDouble(dados[12]);

            SalaComercial sala = new SalaComercial(cod, numero, areaTotal, valor, logradouro,
                    bairro, cidade, descricao, nroBanheiros, andar, nroSala, valorCondominio, nomeEdificio);

            this.lista.add(sala);

            line = br.readLine();
        }

        br.close();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Método para ler Chácaras">
    private void lerChacara() throws FileNotFoundException, IOException {
        int cod = 0, ano = 0, numero = 0, nroQuartos = 0;
        double valor = 0, areaTotal = 0, areaConstruida = 0, distanciaCidade = 0;
        String cidade = " ", bairro = " ", logradouro = " ", descricao = " ", dados;
        int aux = 0;
        String[] line;

        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + System.getProperty("file.separator") + this.tipo + ".csv"));

        dados = br.readLine();
        List<Imovel>listaAux= new ArrayList();
        while (dados != null) {

            line = dados.split(";");

            cod = Integer.parseInt(line[0]);
            numero = Integer.parseInt(line[1]);
            areaTotal = Double.parseDouble(line[2]);
            valor = Double.parseDouble(line[3]);
            logradouro = line[4];
            bairro = line[5];
            cidade = line[6];
            descricao = line[7];
            nroQuartos = Integer.parseInt(line[8]);
            areaConstruida = Double.parseDouble(line[9]);
            ano = Integer.parseInt(line[10]);
            distanciaCidade = Double.parseDouble(line[11]);

            Chacara chacara = new Chacara(cod, numero, valor, cidade, bairro, nroQuartos, areaTotal, areaConstruida, ano, distanciaCidade, logradouro, descricao);

            listaAux.add(chacara);

            dados = br.readLine();

        }
        lista = listaAux;
        

        br.close();
    }
//</editor-fold>

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
    //<editor-fold defaultstate="collapsed" desc="Não implementados">
    @Override
    public List<Imovel> pesquisaValor(double valor) {
        List<Imovel> listaValor = new ArrayList();
        for (Imovel imovel : this.lista) {
            if(imovel.getValor() <=  valor){
                listaValor.add(imovel);
            }
        }
        return listaValor;
    }

    @Override
    public List<Imovel> pesquisaBairro(String bairro) {

        List<Imovel> listaBairro = new ArrayList();
        for (Imovel imovel : this.lista) {
            if(imovel.getBairro().trim().toLowerCase().contains(bairro.toLowerCase().trim())){
                listaBairro.add(imovel);
            }
        }
        return listaBairro;
    }

    //</editor-fold>
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
