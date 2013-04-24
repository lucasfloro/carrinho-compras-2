package br.ex03;
import br.calebe.exemplos.ex01.Pedido;
import br.ex03.controller.EntregaController;
import junit.framework.Assert;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 *
 * @author lucas
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Pedido.class})
public class EntregaTest {
    @Test
    public void executandoClasseExemplo() throws Exception {
        // Cria o objeto Mock da classe ClasseExemploController
        EntregaController controllerMock = PowerMock.createMock(EntregaController.class);
        // Espera que toda instanciação dessa classe seja substituída pelo objeto mockado
        PowerMock.expectNew(EntregaController.class).andReturn(controllerMock);
        // E espera que a resposta pela chamada do método seja determinado
        EasyMock.expect(controllerMock.status(1)).andReturn("Aguardando");
        // "Executa" a configuração programada
        PowerMock.replay(controllerMock, EntregaController.class);
        
        // Chama a classe - internamente, a classe mockada será utilizada
        Pedido tested = new Pedido(1);
        tested.run();
        
        // Faz a verificaçao agendada
        Assert.assertEquals("Aguardando", tested.getStatus());
        // Executa todas as verificação
        PowerMock.verifyAll();
    }
}

