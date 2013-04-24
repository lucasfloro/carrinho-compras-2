package br.calebe.exemplos.ex01;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<Produto> produtos;
        private Pedido pedido;
        private int qtde;

	public Carrinho() {
		produtos = new ArrayList<>();
                qtde = 0;
	}

	public void add(Produto produto) {
		produtos.add(produto);
                qtde++;
	}

	public Produto menorProduto() throws CarrinhoVazioExpected {
		if (produtos.size() == 0)
			throw new CarrinhoVazioExpected();
		Produto menor = produtos.get(0);
		for (Produto produto : produtos) {
			if (produto.getPreco() < menor.getPreco())
				menor = produto;
		}
		return menor;
	}
        
        public int buscaQtde() {
                return qtde;
        }
        
        public boolean remove(Produto p) {
            if (produtos.remove(p)) {
                qtde--;
                return true;
            }
            return false;
        }
        
        public boolean getProduto(Produto prod) {            
                for (Produto p : produtos) {
                    if (p.getNome() == prod.getNome())
                        return true;
                }
                return false;
        }
        
        public double getTotal(){
             double tot = 0;
             for (Produto p : produtos) {
                    tot += p.getPreco();
                }
             return tot;
        }
        
        public void comprar() throws Exception {
            pedido = new Pedido(1);
            for (Produto p : produtos) {
                pedido.addItem(p, 1);
            }
            
            pedido.setValorTotal(getTotal());
        }
}
