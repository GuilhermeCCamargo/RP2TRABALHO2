/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.tiposimoveis;

import java.security.InvalidParameterException;

/**
 *
 * @author Gustavo Carvalho
 */
public class Chacara extends Imovel {
    
    /**
     * Atributos próprios de uma Chacara
     */
    
    private int nroQuartos;
    private double areaConstruida;
    private int ano;
    private int distanciaCidade;
    
    
    /**
     * Construtor que contém os atributos necessários para a criação de um imóvel
     * @param numero - número do imovel to tipo inteiro
     * @param valor - preço do imóvel do tipo double
     * @param cidade - endereço do tipo String
     */

    public Chacara(int numero, double valor, String cidade) {
        super(numero, valor, cidade);
        this.nroQuartos = 00;
        this.areaConstruida = 00;
        this.ano = 00;
        this.distanciaCidade = 00;
    }
    
    /**
     * Construtor com todos os dados para a criação de um imóvel do tipo Chacara
     * @param numero - Número do imovel to tipo inteiro
     * @param valor - preço do imóvel do tipo double
     * @param cidade - cidade do tipo String
     * @param bairro - String que informa o bairro
     * @param nroQuartos - inteiro que informa a quantidade de quartos em uma chacara
     * @param areaConstruida - dado do tipo Double para informar a area total construida de uma chacara em metros quadrados
     * @param ano - indica o ano de construção dessa chacara
     * @param distanciaCidade - informa a distância dessa chacara até a cidade mais próxima
     * @param logradouro - informa a localidade dessa chacara
     * @param descricao - descricao sobre essa chacara do tipo string
     */
    
    public Chacara (int numero, double valor, String cidade, 
            String bairro, int nroQuartos, double areaConstruida, 
            int ano, int distanciaCidade, 
            String logradouro, String descricao){
        
        this(numero, valor, cidade);
        
        if(nroQuartos<0 || areaConstruida<0 || ano<0 || distanciaCidade<0){
            throw new InvalidParameterException("Os números informados devems ser positivos");
        }
        
        this.nroQuartos = nroQuartos;
        this.areaConstruida = areaConstruida;
        this.ano = ano;
        this.distanciaCidade = distanciaCidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.descricao = descricao;
        
    }

    public Chacara(int cod, int numero, double valor, String cidade, String bairro, int nroQuartos, double areaTotal, int ano, int distanciaCidade, String logradouro, String descricao) {
        super(cod, numero, valor, cidade);
        this.nroQuartos = nroQuartos;
        this.areaConstruida = areaConstruida;
        this.ano = ano;
        this.distanciaCidade = distanciaCidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.descricao = descricao;
    }

    public Chacara(int cod, int numero, double valor, String cidade, String bairro, int nroQuartos, double areaTotal, double areaConstruida, int ano, int distanciaCidade, String logradouro, String descricao) {
        super(cod, numero, valor, cidade);
        this.nroQuartos = nroQuartos;
        this.areaConstruida = areaConstruida;
        this.ano = ano;
        this.distanciaCidade = distanciaCidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.descricao = descricao;
        this.areaConstruida = areaConstruida;
    }

    
    /**
     * @return the nroQuartos
     */
    public int getNroQuartos() {
        return nroQuartos;
    }

    /**
     * @param nroQuartos the nroQuartos to set
     */
    public void setNroQuartos(int nroQuartos) {
        this.nroQuartos = nroQuartos;
    }

    /**
     * @return the areaConstruida
     */
    public double getAreaConstruida() {
        return areaConstruida;
    }

    /**
     * @param areaConstruida the areaConstruida to set
     */
    public void setAreaConstruida(float areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the distancia
     */
    public int getDistanciaCidade() {
        return distanciaCidade;
    }

    /**
     * @param distanciaCidade
     */
    public void setDistanciaCidade(int distanciaCidade) {
        this.distanciaCidade = distanciaCidade;
    }
    
    /**
     * Método toString que será exibido no método de Consulta
     * @return Cod && distanciaCidade
     */
    @Override
    public String toString(){
        return "Código: "+getCod()+" - "+"Area total (em M²): "+getAreaConstruida()+" - "+"Distância da cidade (em KM): "+this.distanciaCidade;
    }
    
    @Override
    public String writeFile(){
        return getCod()+";"+getNumero()+";"+getAreaTotal()+";"+getValor()+";"+getLogradouro()+";"+getBairro()+";"+
        getCidade()+";"+getDescricao()+";"+getNroQuartos()+";"+getAreaConstruida()+";"+getAno()+";"+getDistanciaCidade()+";\n";
    }
}
