/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
