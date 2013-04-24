/**
 *
 * @author 
 * Nomes: Carlos Damian             TIA: 310.4726-2
 *        Lucas Flóro e Silva       TIA: 310.8906-2
 *        Rodrigo Drumond           TIA: 306.5574-9
 */

package br.ex03.controller;

import br.calebe.exemplos.ex01.Pedido;
import br.ex03.controller.EJBStatelessEntregaInterface;
import java.io.FileInputStream;
import java.util.Properties;
import javax.naming.InitialContext;

public class EntregaController implements EJBStatelessEntregaInterface {
    private EJBStatelessEntregaInterface ejb;

    public EntregaController() throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("jndi.properties"));
        InitialContext ctx = new InitialContext(props);
        ejb = (EJBStatelessEntregaInterface) ctx.lookup("ejb/EJBStatelessEntrega");
    }

    @Override
    public String status(int nPedido) {
        return ejb.status(nPedido);
    }
}
