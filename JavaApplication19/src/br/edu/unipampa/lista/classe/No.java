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
    private T info;
    private No prox;
    private No ant;

    public No(T info, No prox, No ant){
        this.info = info;
        this.prox = prox;
        this.ant = ant;
    }
    
    /**
     * @return the prox
     */
    public No getProx() {
        return prox;
    }

    /**
     * @return the ant
     */
    public No getAnt() {
        return ant;
    }

    /**
     * @param prox the prox to set
     */
    public void setProx(No prox) {
        this.prox = prox;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(No ant) {
        this.ant = ant;
    }

    /**
     * @return the info
     */
    public T getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(T info) {
        this.info = info;
    }
}
