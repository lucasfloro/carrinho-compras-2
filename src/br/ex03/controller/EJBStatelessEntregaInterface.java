/**
 *
 * @author 
 * Nomes: Carlos Damian             TIA: 310.4726-2
 *        Lucas Flóro e Silva       TIA: 310.8906-2
 */

package br.ex03.controller;

import javax.ejb.Remote;

@Remote
public interface EJBStatelessEntregaInterface {

    String status(int nPedido);
    
}
