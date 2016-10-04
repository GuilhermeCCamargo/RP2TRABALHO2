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
    protected Tipo tipo;
    protected Double areaConstruida;
    protected int nQuartos;
    protected int nVagasGaragem;
    protected int anoConstrucao;

    
    public Casa(int numero, double valor, String logradouro) {
        super(numero, valor, logradouro);
    }
    
}
