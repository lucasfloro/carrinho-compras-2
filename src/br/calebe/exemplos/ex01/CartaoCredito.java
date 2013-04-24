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
