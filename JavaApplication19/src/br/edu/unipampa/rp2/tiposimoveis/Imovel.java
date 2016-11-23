/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unipampa.rp2.tiposimoveis;

//<editor-fold defaultstate="collapsed" desc="Importações">

import java.io.Serializable;
import java.security.InvalidParameterException;

//</editor-fold>

/**
 *
 * @author yuryalencar
 */
public abstract class Imovel  implements Serializable{
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private static int codigo = 0;
    protected int cod;
    protected int numero;
    protected double areaTotal;
    protected double valor;
    protected String logradouro;
    protected String bairro;
    protected String cidade;
    protected String descricao;

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    
    /**
     * Construtor que recebe somente os itens mais importantes para a criação
     * de um imóvel
     * @param numero - número da imóvel, sendo do tipo inteiro positivo - Caso não
     * seja uma exception do tipo InvalidParameterException será lançada.
     * @param valor - preço do imóvel, sendo do tipo double
     * @param cidade - cidade do imóvel, sendo do tipo String
     */
    public Imovel(int numero, double valor, String cidade) {
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
        this.cidade = cidade;
    }

    /**
     * Construtor para a leitura de arquivos não incrementar o código.
     * @param cod
     * @param numero
     * @param valor
     * @param cidade 
     */
    public Imovel(int cod, int numero, double valor, String cidade) {
        //@TODO: aqui acontece uma verificação para analisar se o número informado é
        //um número inteiro positivo, caso não 
        if(cod < 0 || numero < 0 || valor < 0){
            throw new InvalidParameterException("Números informados devem ser inteiros positivos");
        }
        // @TODO: coloquei o código estático e com isso sempre que for cadastrado
        //um novo imóvel o código será incrementado.
        this.cod = cod;
        
        this.numero = numero;
        this.valor = valor;
        this.cidade = cidade;
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Inicializador dos códigos">
    
    /**
     * Método para começar sempre a partir de um código
     * caso já tenha arquivos salvos.
     * @param cod - código no qual irá iniciar a sequência
     */
    public static void startCodigo(int cod){
        Imovel.codigo = cod;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="String que vai escrever no arquivo">
    
    /**
     * Método que pega todos os atributos e coloca em formato .csv
     * para que se possa pegar a string para escrever dentro do arquivo
     * @return - retorna uma String com todos os atributos separados por
     * vírgula ordem (cod, numero, areaTotal, valor, logradouro, bairro, cidade
     * descrição + os específicos)
     */
    public abstract String writeFile();

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
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
