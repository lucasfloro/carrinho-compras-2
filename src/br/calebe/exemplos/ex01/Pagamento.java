/**
 *
 * @author 
 * Nomes: Carlos Damian             TIA: 310.4726-2
 *        Lucas Flóro e Silva       TIA: 310.8906-2
 *        Rodrigo Drumond           TIA: 306.5574-9
 */

package br.calebe.exemplos.ex01;

import br.ex03.controller.PagamentoController;

public class Pagamento {
    private PagamentoController controller;
    private String resposta;
    private CartaoCredito cartao;
    private double valorTotal;

    public Pagamento(CartaoCredito cartao) throws Exception {      
        this.cartao = cartao;
        controller = new PagamentoController();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void run(CartaoCredito cartao, double valor) {
        resposta = controller.pagto(cartao, valor);
    }
    
    public String getResposta() {
        return resposta;
    }
}
