/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
    
    //<editor-fold defaultstate="collapsed" desc="Incluir, consultar por codigo, editar, excluir e escreverArquivo (Implementados)">
    
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

    @Override
    public boolean lerArquivo() {
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
