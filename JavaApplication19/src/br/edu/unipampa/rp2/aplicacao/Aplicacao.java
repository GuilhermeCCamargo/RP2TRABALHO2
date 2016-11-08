/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unipampa.rp2.aplicacao;

//<editor-fold defaultstate="collapsed" desc="Importações">

import br.edu.unipampa.rp2.frames.Inicial;

//</editor-fold>

/**
 *
 * @author yuryalencar
 */
public class Aplicacao {
    
    //<editor-fold defaultstate="collapsed" desc="Main">
    
    /**
     * A Main que chama a janela inicial
     * @param args 
     */
    public static void main(String[] args) {
        
        Inicial abrir = new Inicial();
        abrir.setVisible(true);
        
    }
    
    //</editor-fold>
    
}
