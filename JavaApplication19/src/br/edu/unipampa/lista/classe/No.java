/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unipampa.lista.classe;

import java.io.Serializable;

/**
 *
 * @author yuryalencar
 * @param <T>
 */
public class No<T> implements Serializable {
    
    private T info;
    private No prox;
    private No ant;

    /**
     * Construtor para a criação de um nó.
     * @param info - informação do nó.
     * @param prox - Ponteiro para o próximo nó.
     * @param ant - ponteiro para o nó anterior.
     */
    public No(T info, No prox, No ant){
        this.info = info;
        this.prox = prox;
        this.ant = ant;
    }
    
    /**
     * Construtor para a criação de um nó.
     * @param info - informação do nó.
     */
    public No(T info){
        this.info = info;
        this.prox = null;
        this.ant = null;
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
    
    @Override
    public String toString(){
        return this.getInfo().toString();
    }
}
