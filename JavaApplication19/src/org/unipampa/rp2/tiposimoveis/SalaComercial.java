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
public class SalaComercial extends Imovel{
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private int nroBanheiros;
    private int andar; 
    private int nroSala;
    private double valorCondominio;
    private String nomeEdificio;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    
    /**
     * Construtor somente com os dados essenciais para a criação de um imóvel
     * @param numero - Número do imovel to tipo inteiro
     * @param valor - preço do imóvel do tipo double
     * @param cidade - endereço do tipo String
     */
    public SalaComercial(int numero, double valor, String cidade) {
        super(numero, valor, cidade);
        this.andar = 0;
        this.nroBanheiros = 0;
        this.nroSala = 0;
        this.valorCondominio = 0;
        this.nomeEdificio = "";
        this.logradouro = "";
        this.bairro = "";
    }

    /**
     * Construtor com todos os dados para a criação de um imóvel do tipo Sala Comercial
     * @param numero - Número do imovel to tipo inteiro
     * @param valor - preço do imóvel do tipo double
     * @param logradouro - endereço do tipo String
     * @param nroBanheiros - inteiro que diz respeito a quantidade de banheiros
     * inteiro positivo;
     * @param andar - inteiro que diz o andar também tem que ser inteiro positivo
     * @param nroSala - numero da sala, inteiro positivo
     * @param valorCondominio - preço do condominio, do tipo double positivo
     * @param nomeEdificio - nome do edificio do tipo String
     * @param areaTotal - area total da sala do tipo long, long positivo
     * @param descricao - descricao sobre a sala do tipo string
     * Obs.: Caso algo que não seja número positivos será lançada uma exceção do tipo
     * InvalidParameterException, só não irá criar o modelo caso os parâmetros numero
     * ou valor sejam inválidos, caso sejam e os outros valores sejam inválidos irá
     * criar um imóvel normal só que com os campos inicializados em branco ou 0.
     * @param cidade - cidade onde está presente o imóvel
     * @param bairro - bairro onde fica o imóvel.
     */
    public SalaComercial(int numero, double valor, String logradouro, 
            int nroBanheiros, int andar, int nroSala, double valorCondominio,
            String nomeEdificio, double areaTotal, String descricao, String cidade,
            String bairro) {
    
        this(numero, valor, cidade);
        
        if(nroSala<0 || nroBanheiros<0 || areaTotal<0 || valorCondominio<0 || andar<0){
            throw new InvalidParameterException("Os números informados devems ser positivos");
        }
        
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.andar = andar;
        this.nroBanheiros = nroBanheiros;
        this.nroSala = nroSala;
        this.valorCondominio = valorCondominio;
        this.nomeEdificio = nomeEdificio;
        this.areaTotal = areaTotal;
        this.descricao = descricao;
        
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
    /**
     * @return the nroBanheiros
     */
    public int getNroBanheiros() {
        return nroBanheiros;
    }

    /**
     * @param nroBanheiros the nroBanheiros to set
     */
    public void setNroBanheiros(int nroBanheiros) {
        this.nroBanheiros = nroBanheiros;
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
     * @return the nroSala
     */
    public int getNroSala() {
        return nroSala;
    }

    /**
     * @param nroSala the nroSala to set
     */
    public void setNroSala(int nroSala) {
        this.nroSala = nroSala;
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

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="toString">
    
    @Override
    public String toString(){
        return "Código: "+getCod()+" - "+"Nome do edifício: "+this.nomeEdificio;
    }

    //</editor-fold>
    
}
