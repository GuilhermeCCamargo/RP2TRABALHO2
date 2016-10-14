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
public class Casa extends Imovel {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected Tipo tipo;
    protected double areaConstruida;
    protected int nQuartos;
    protected int nVagasGaragem;
    protected int anoConstrucao;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="construtores">
    public Casa(int cod,int numero,double areaTotal,double valor,String logradouro,
            String bairro,String cidade,String descricao, Tipo tipo,
            double areaConstruida,int nQuartos,int nVagasGaragem,int anoConstrucao) {
        
        super(cod, numero, valor, cidade);
        this.areaTotal = areaTotal;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.descricao = descricao;
        this.tipo = tipo;
        this.areaConstruida = areaConstruida;
        this.nQuartos = nQuartos;
        this.nVagasGaragem = nVagasGaragem;
        this.anoConstrucao = anoConstrucao;
        
    }

    public Casa(int numero, double valor, String logradouro, Tipo tipo,
            double areaConstruida, int nQuartos, int nVagasGaragem, int anoConstrucao,
            String cidade, String bairro) {

        super(numero, valor, cidade);
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.areaConstruida = areaConstruida;
        this.nQuartos = nQuartos;
        this.nVagasGaragem = nVagasGaragem;
        this.anoConstrucao = anoConstrucao;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Gets e Sets">
    /**
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the areaConstruida
     */
    public Double getAreaConstruida() {
        return areaConstruida;
    }

    /**
     * @param areaConstruida the areaConstruida to set
     */
    public void setAreaConstruida(Double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    /**
     * @return the nQuartos
     */
    public int getNQuartos() {
        return nQuartos;
    }

    /**
     * @param nQuartos the nQuartos to set
     */
    public void setNQuartos(int nQuartos) {
        this.nQuartos = nQuartos;
    }

    /**
     * @return the nVagasGaragem
     */
    public int getNVagasGaragem() {
        return nVagasGaragem;
    }

    /**
     * @param nVagasGaragem the nVagasGaragem to set
     */
    public void setNVagasGaragem(int nVagasGaragem) {
        this.nVagasGaragem = nVagasGaragem;
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
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        return "Código: " + getCod() + " Tipo: " + getTipo() + " Valor: " + getValor();
    }

//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="writeFile">
    /**
     * Método que pega todos os atributos e coloca em formato .csv
     * para que se possa pegar a string para escrever dentro do arquivo
     * @return - retorna uma String com todos os atributos separados por
     * vírgula ordem (cod, numero, areaTotal, valor, logradouro, bairro, cidade
     * descricao, tipo, areaContruida, NQuartos, NVagasGaragem, anoContrucao)
     */
    @Override
    public String writeFile() {
        return super.getCod()+";"+super.getNumero()+";"+super.getAreaTotal()+";"+
                super.getValor()+";"+super.getLogradouro()+";"+super.getBairro()+";"+
                super.getCidade()+";"+getDescricao()+";"+ tipo.getTipo()+";"+
                getAreaConstruida()+";"+getNQuartos()+";"+getNVagasGaragem()+";"+
                getAnoConstrucao()+";\n";
    }
//</editor-fold>

}
