package br.ex03.controller;

import br.calebe.exemplos.ex01.CartaoCredito;
import java.io.FileInputStream;
import java.util.Properties;
import javax.naming.InitialContext;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PagamentoController implements EJBStatelessPagamentoInterface {

    private EJBStatelessPagamentoInterface ejb;

    public PagamentoController() throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("jndi.properties"));
        InitialContext ctx = new InitialContext(props);
        ejb = (EJBStatelessPagamentoInterface) ctx.lookup("ejb/EJBStatelessPagamento");
    }

    @Override
    public String pagto(CartaoCredito cartao, double valor) {
        return ejb.pagto(cartao, valor);
    }
}
