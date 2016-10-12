/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.listaimoveis;

//<editor-fold defaultstate="collapsed" desc="Importações">

import org.unipampa.rp2.tiposimoveis.Imovel;
import java.util.List;

//</editor-fold>

/**
 * Interace que especifica a assinatura dos métodos que devem ser implementados
 * pela lista de imóveis.
 */
interface ListaImoveis {

    //<editor-fold defaultstate="collapsed" desc="Implementados">
    
    /**
     * Inclui um imóvel na lista de imóveis.
     *
     * @param im Imóvel a ser incluído.
     * @return True se a inclusão foi bem sucedida ou False em caso contrário.
     */
    public boolean incluir(Imovel im);

    /**
     * Consulta o imóvel com o código informado.
     *
     * @param codigo Código a ser consultado.
     * @return Imovel com o código informado ou null em caso de não existir
     * imóvel com o código informado.
     */
    public Imovel consultar(int codigo);
    
    /**
     * Edita o imóvel com o código informado.
     *
     * @param código Código do imóvel a ser editado.
     * @param im Imóvel com as novas informações.
     * @return True se o imóvel com o código informado for editado e False caso
     * nenhum imóvel com o código infornado for encontrado.
     */
    public boolean editar(int codigo, Imovel im);

    /**
     * Exclui o imóvel com o código informado.
     *
     * @param codigo Código do imóvel a ser excluído.
     * @return True se o imóvel com o código informado for excluído e False caso
     * nenhum imóvel com o código infornado for encontrado.
     */
    public boolean excluir(int codigo);

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Não implementados">

    /**
     * Ordena os imóveis em ordem crescente de código.
     *
     * @return Uma lista com os imóveis ordenados em ordem crescente de código.
     */
    public List<Imovel> ordenarCodigo();

    /**
     * Ordena os imóveis em ordem crescente de valor.
     *
     * @return Uma lista com os imóveis ordenados em ordem crescente de valor.
     */
    public List<Imovel> ordenarValor();

    /**
     * Ordena os imóveis em ordem decrescente de área total.
     *
     * @return Uma lista com os imóveis ordenados em ordem decrescente de área
     * total.
     */
    public List<Imovel> ordenarArea();

    /**
     * Pesquisa os imóveis que possuem valor menor ou igual ao informado.
     *
     * @param valor Valor máximo do imóvel a ser pesquisado.
     * @return Uma lista contendo os imóveis com valor menor ou igual ao
     * informado.
     */
    public List<Imovel> pesquisaValor(double valor);

    /**
     * Pesquisa os imóveis que estão localizados no bairro informado.
     *
     * @param bairro Bairro a ser pesquisado.
     * @return Uma lista contendo os imóveis localizados no bairro informado.
     */
    public List<Imovel> pesquisaBairro(String bairro);

    /**
     * Escreve a lista de imóveis em um arquivo CSV.
     *
     * @return True se a lista for escrita corretamente no arquivo e False em
     * caso contrário.
     */
    public boolean escreverArquivo();

    /**
     * Le a lista de imóveis de um arquivo CSV.
     *
     * @return True se a lista for lida corretamente do arquivo e False em caso
     * contrário.
     */
    public boolean lerArquivo();

    //</editor-fold>
    
}
