package br.ex03.controller;

import br.calebe.exemplos.ex01.CartaoCredito;
import javax.ejb.Remote;

@Remote
public interface EJBStatelessPagamentoInterface {

    String pagto(CartaoCredito cartao, double valor);
    
}
