package br.ex03;

import br.calebe.exemplos.ex01.CartaoCredito;
import br.calebe.exemplos.ex01.Pagamento;
import br.ex03.controller.PagamentoController;
import junit.framework.Assert;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 *
 * @author Calebe de Paula Bianchini
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Pagamento.class})
public class PagamentoTest {

    @Test
    public void executandoClasseExemplo() throws Exception {
        CartaoCredito cartao = new CartaoCredito("12345678901234", "1223", "12/2020", "NOME COMPLETO", "Visa" );
        
        // Cria o objeto Mock da classe ClasseExemploController
        PagamentoController controllerMock = PowerMock.createMock(PagamentoController.class);
        // Espera que toda instanciação dessa classe seja substituída pelo objeto mockado
        PowerMock.expectNew(PagamentoController.class).andReturn(controllerMock);
        // E espera que a resposta pela chamada do método seja determinado
        EasyMock.expect(controllerMock.pagto(cartao, 10.0)).andReturn("Autorizado");
        // "Executa" a configuração programada
        PowerMock.replay(controllerMock, PagamentoController.class);
        
        // Chama a classe - internamente, a classe mockada será utilizada
        Pagamento tested = new Pagamento(cartao);
        tested.run(cartao, 10.0);
        
        // Faz a verificaçao agendada
        Assert.assertEquals("Autorizado", tested.getResposta());
        // Executa todas as verificação
        PowerMock.verifyAll();
    }
}
