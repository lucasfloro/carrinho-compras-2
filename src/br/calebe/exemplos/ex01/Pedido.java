/**
 *
 * @author 
 * Nomes: Carlos Damian             TIA: 310.4726-2
 *        Lucas Flóro e Silva       TIA: 310.8906-2
 */

package br.calebe.exemplos.ex01;

import br.ex03.controller.EntregaController;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private EntregaController controller;    
    private int nPedido;

    public int getnPedido() {
        return nPedido;
    }

    public void setnPedido(int nPedido) {
        this.nPedido = nPedido;
    }
    private Pagamento pagto;
    private List<ItemPedido> itens;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private double valorTotal;

    public Pedido(int nPedido) throws Exception {
        this.nPedido = nPedido;
        List<ItemPedido> itens = new ArrayList<>();
        status = "Aguardando pagamento";
        valorTotal = 0;
        controller = new EntregaController();
    }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void addItem(Produto p, int i) {
        ItemPedido e = new ItemPedido(p, i);
        itens.add(e);
    }
    
    public void run() {
        status = controller.status(getnPedido());
    }       

}
