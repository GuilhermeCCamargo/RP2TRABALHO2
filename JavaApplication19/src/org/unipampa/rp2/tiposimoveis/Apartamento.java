/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.tiposimoveis;

import java.security.InvalidParameterException;



/**
 *
 * @author GuilhermeCCamargo
 */
public class Apartamento extends Imovel{

    private String nomeEdificio;
    private int andar;
    private int nroApartamento;
    private int nroQuartos;
    private int vgsGaragem; //
    private int anoConstrucao;
    private double valorCondominio;
   
    /**
     * Construtor com os dados essenciais para a criação de um imóvel
     * @param numero - Número do imóvel (tipo inteiro)
     * @param valor - Preço do imóvel (tipo double)
     * @param logradouro - Endereço tipo (String)
     */
    public Apartamento(int numero, double valor, String logradouro) {
        super(numero, valor, logradouro);
        
        this.nomeEdificio = "null";
        this.andar = 00;
        this.nroApartamento = 00;
        this.nroQuartos = 00;
        this.vgsGaragem = 00; 
        this.anoConstrucao = 00;
        this.valorCondominio = 00;
        
    }
    /**
     * Construtor para a criação de um imóvel do tipo Apartamento
     * @param logradouro - Endereço (Tipo String)
     * @param numero - Número do imóvel (Tipo Inteiro)
     * @param nomeEdificio - Nome do edificio onde o apartamento está situado (Tipo String) 
     * @param andar - Andar do apartamento (Tipo Inteiro)
     * @param valor - Preço do imóvel (Tipo Double)
     * @param anoConstrucao - Ano de construção do Edifício (Tipo Inteiro)
     * @param nroQuartos - Número de quartos (Tipo Inteiro)
     * @param vgsGaragem - Número de vagas na garagem (Tipo Inteiro)
     * @param valorCondominio - preço do condominio, do tipo double positivo
     */
    public Apartamento(String logradouro, int numero,  double valor, String nomeEdificio, int andar, 
            int anoConstrucao, int nroQuartos, int vgsGaragem, double valorCondominio) {
    
       this(numero, valor, logradouro);
        
        if(numero < 0 || andar < 0 || valor < 0 || anoConstrucao < 0 || nroQuartos < 0 || vgsGaragem < 0 || valorCondominio < 0){
            throw new InvalidParameterException("Forneça números válidos");
        }
        
        this.nomeEdificio = nomeEdificio;
        this.andar = andar;
        this.nroApartamento = nroApartamento;
        this.nroQuartos = nroQuartos;
        this.vgsGaragem = vgsGaragem; 
        this.anoConstrucao = anoConstrucao;
        this.valorCondominio = valorCondominio;
        
    }
   
    /**
     * @return the nomeEdificio
     */
    public String getNomeEdificio() {
        return nomeEdificio;
    }

    /**
     * @param nomeEdificio the nomeEdificio to set
     */
    public void setNomeEdificio(String nomeEdificio) {
        this.nomeEdificio = nomeEdificio;
    }

    /**
     * @return the andar
     */
    public int getAndar() {
        return andar;
    }

    /**
     * @param andar the andar to set
     */
    public void setAndar(int andar) {
        this.andar = andar;
    }

    /**
     * @return the nroApartamento
     */
    public int getNroApartamento() {
        return nroApartamento;
    }

    /**
     * @param nroApartamento the nroApartamento to set
     */
    public void setNroApartamento(int nroApartamento) {
        this.nroApartamento = nroApartamento;
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
     * @return the vgsGaragem
     */
    public int getVgsGaragem() {
        return vgsGaragem;
    }

    /**
     * @param vgsGaragem the vgsGaragem to set
     */
    public void setVgsGaragem(int vgsGaragem) {
        this.vgsGaragem = vgsGaragem;
    }

    /**
     * @return the anoConstrucao
     */
    public int getAnoConstrucao() {
        return anoConstrucao;
    }

    /**
     * @param anoConstrucao the anoConstrucao to set
     */
    public void setAnoConstrucao(int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }

    /**
     * @return the valorCondominio
     */
    public double getValorCondominio() {
        return valorCondominio;
    }

    /**
     * @param valorCondominio the valorCondominio to set
     */
    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }    
}    