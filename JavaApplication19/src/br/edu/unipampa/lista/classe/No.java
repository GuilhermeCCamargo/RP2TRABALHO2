/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unipampa.lista.classe;

/**
 *
 * @author yuryalencar
 */
public class No<T> {
    private T prox;
    private T ant;

    public No(T prox, T ant){
        this.prox = prox;
        this.ant = ant;
    }
    
    /**
     * @return the prox
     */
    public T getProx() {
        return prox;
    }

    /**
     * @return the ant
     */
    public T getAnt() {
        return ant;
    }

    /**
     * @param prox the prox to set
     */
    public void setProx(T prox) {
        this.prox = prox;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(T ant) {
        this.ant = ant;
    }
}
