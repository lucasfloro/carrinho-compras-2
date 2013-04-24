/**
 *
 * @author 
 * Nomes: Carlos Damian             TIA: 310.4726-2
 *        Lucas Flóro e Silva       TIA: 310.8906-2
 *        Rodrigo Drumond           TIA: 306.5574-9
 */

package br.calebe.exemplos.ex01;

public class CartaoCredito {
    private String numero;
    private String codSeguranca;
    private String validade;
    private String nomeCompleto;
    private String bandeira;
    
    public CartaoCredito(String numero, String codSeg, String validade, String nome, String bandeira) {
        this.numero = numero;
        this.codSeguranca = codSeg;
        this.validade = validade;
        this.nomeCompleto = nome;
        this.bandeira = bandeira;
    }
}
