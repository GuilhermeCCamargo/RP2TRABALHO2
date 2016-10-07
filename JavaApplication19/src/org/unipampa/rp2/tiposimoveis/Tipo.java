/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.tiposimoveis;

/**
 *
 * @author vitao375
 */
public enum Tipo {
    RESIDENCIAL("Residencial"),
    COMERCIAL("Comercial");
    
    //Variável final para que não possa ser modificada
    private final String tipo;
    
    /**
     * Construtor privado, onde recebe pela própria classe
     * o tipo por parâmetro e o adiciona em uma variável final.
     * @param tipo - String do valor dentro da classe.
     */
    private Tipo(String tipo){
        this.tipo = tipo;
    }
    
    /**
     * Método que retorna o nome do tipo
     * o que fica entre "()"
     * @return - retorna uma String com o valor
     * do tipo
     */
    public String getTipo(){
        return this.tipo;
    }
    
    /**
     * Método estático para que se possa verificar
     * e pegar somente o tipo correto.
     * @param tipo - String com o tipo que deseja
     * buscar dentro da lista de valores.
     * @return - retorna o tipo ou null caso o mesmo
     * não tenha sido encontrado.
     */
    public static Tipo verificarTipo(String tipo){
        
        for (Tipo t : Tipo.values()) {
            if(t.getTipo().equals(tipo)){
                return t;
            }
        }
        
        return null;
    }
    
}
