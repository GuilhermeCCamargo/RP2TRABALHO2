/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.tiposimoveis;

/**
 *
 * @author yuryalencar
 */
public class Terreno extends Imovel{
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private double dimensaoFrente;
    private double dimensaoLado;

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    
    /**
     * Construtor com o mínimo para adicionar um terreno no
     * sistema
     * @param numero - número
     * @param valor - valor do terreno
     * @param cidade - Cidade onde se localiza o terreno
     */
    public Terreno(int numero, double valor, String cidade){
        super(numero, valor, cidade);
    }
    
    /**
     *  Construtor contendo todos os parâmetros possíveis para a inserção
     * de um terreno
     * @param numero - numero do terreno
     * @param valor - valor o mesmo
     * @param cidade - cidade onde se localiza o terreno
     * @param descricao - descricao sobre o mesmo
     * @param logradouro - logradouro so terreno
     * @param areaTotal - area total do terreno em m²
     * @param bairro - bairro onde se localiza o terreno
     * @param dimensaoFrente - dimensao de frente do terreno em m
     * @param dimensaoLado - dimensao de lado do terreno em m
     */
    public Terreno(int numero , double valor, String cidade, String descricao,
            String logradouro, double areaTotal, String bairro, double dimensaoFrente,
            double dimensaoLado){
        this(numero, valor, cidade);
        this.logradouro = logradouro;
        this.descricao = descricao;
        this.areaTotal = areaTotal;
        this.bairro = bairro;
        this.dimensaoFrente = dimensaoFrente;
        this.dimensaoLado = dimensaoLado;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
    /**
     * @return the dimensaoFrente
     */
    public double getDimensaoFrente() {
        return dimensaoFrente;
    }

    /**
     * @param dimensaoFrente the dimensaoFrente to set
     */
    public void setDimensaoFrente(double dimensaoFrente) {
        this.dimensaoFrente = dimensaoFrente;
    }

    /**
     * @return the dimensaoLado
     */
    public double getDimensaoLado() {
        return dimensaoLado;
    }

    /**
     * @param dimensaoLado the dimensaoLado to set
     */
    public void setDimensaoLado(double dimensaoLado) {
        this.dimensaoLado = dimensaoLado;
    }
    
    //</editor-fold>
    
}
