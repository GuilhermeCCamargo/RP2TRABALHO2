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

//</editor-fold>

/**
 *
 * @author yuryalencar
 */
public class Lista implements ListaImoveis {

    //<editor-fold defaultstate="collapsed" desc="List (Atributo)">
    private List<Imovel> lista = new ArrayList();
    //</editor-fold>
         
    //<editor-fold defaultstate="collapsed" desc="Incluir, consultar, editar e excluir (Implementados)">
    
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
    public boolean escreverArquivo() {
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
    public List getLista(){
        return this.lista;
    }

    //</editor-fold>
    
}