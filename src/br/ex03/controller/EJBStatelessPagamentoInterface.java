/**
 *
 * @author 
 * Nomes: Carlos Damian             TIA: 310.4726-2
 *        Lucas Flóro e Silva       TIA: 310.8906-2
 */

package br.ex03.controller;

import br.calebe.exemplos.ex01.CartaoCredito;
import javax.ejb.Remote;

@Remote
public interface EJBStatelessPagamentoInterface {

    String pagto(CartaoCredito cartao, double valor);
    
}
