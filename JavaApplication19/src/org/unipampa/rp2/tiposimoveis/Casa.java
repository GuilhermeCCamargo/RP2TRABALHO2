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

public class Casa extends Imovel{
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected Tipo tipo;
    protected Double areaConstruida;
    protected int nQuartos;
    protected int nVagasGaragem;
    protected int anoConstrucao;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="construtores">
    public Casa(int numero, double valor, String logradouro) {
        super(numero, valor, logradouro);
    }
    public Casa(int numero, double valor, String logradouro, Tipo tipo,
            Double areaConstruida, int nQuartos, int nVagasGaragem, int anoConstrucao) {
   
        super(numero, valor, logradouro);
        this.tipo = tipo;
        this.areaConstruida=areaConstruida;
        this.nQuartos=nQuartos;
        this.nVagasGaragem=nVagasGaragem;
        this.anoConstrucao=anoConstrucao;
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
    public int getnQuartos() {
        return nQuartos;
    }

    /**
     * @param nQuartos the nQuartos to set
     */
    public void setnQuartos(int nQuartos) {
        this.nQuartos = nQuartos;
    }

    /**
     * @return the nVagasGaragem
     */
    public int getnVagasGaragem() {
        return nVagasGaragem;
    }

    /**
     * @param nVagasGaragem the nVagasGaragem to set
     */
    public void setnVagasGaragem(int nVagasGaragem) {
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
    public String toString(){
        return "Código: "+getCod()+" Tipo: "+getTipo()+" Valor: "+getValor();
    }
        
//</editor-fold>
}
