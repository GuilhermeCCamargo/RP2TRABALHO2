/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.tiposimoveis;

//<editor-fold defaultstate="collapsed" desc="Importações">

import java.security.InvalidParameterException;

//</editor-fold>

/**
 *
 * @author yuryalencar
 */
public abstract class Imovel {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private static int codigo = 0;
    protected int cod;
    protected int numero;
    protected double areaTotal;
    protected double valor;
    protected String logradouro;
    protected String descricao;

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    
    /**
     * Construtor que recebe somente os itens mais importantes para a criação
     * de um imóvel
     * @param numero - número da imóvel, sendo do tipo inteiro positivo - Caso não
     * seja uma exception do tipo InvalidParameterException será lançada.
     * @param valor - preço do imóvel, sendo do tipo double
     * @param logradouro - logradouro do imóvel, sendo do tipo String
     */
    public Imovel(int numero, double valor, String logradouro) {
        //@TODO: aqui acontece uma verificação para analisar se o número informado é
        //um número inteiro positivo, caso não 
        if(numero < 0 || valor < 0){
            throw new InvalidParameterException("Números informados devem ser inteiros positivos");
        }
        // @TODO: coloquei o código estático e com isso sempre que for cadastrado
        //um novo imóvel o código será incrementado.
        this.cod = codigo;
        Imovel.codigo++; 
        
        this.numero = numero;
        this.valor = valor;
        this.logradouro = logradouro;
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the areaTotal
     */
    public double getAreaTotal() {
        return areaTotal;
    }

    /**
     * @param areaTotal the areaTotal to set
     */
    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //</editor-fold>
    
}
