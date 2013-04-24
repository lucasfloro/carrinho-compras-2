/**
 *
 * @author 
 * Nomes: Carlos Damian             TIA: 310.4726-2
 *        Lucas Flóro e Silva       TIA: 310.8906-2
 *        Rodrigo Drumond           TIA: 306.5574-9
 */

package br.calebe.exemplos.ex01;

public class Produto {

	private String nome;
	private double preco;

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public boolean equals(Object obj) {
		Produto p = (Produto) obj;
		return nome.equals(p.nome);
	}
        
        public String getNome() {
            return this.nome;
        }
        
}
