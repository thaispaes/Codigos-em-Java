package curso.dio.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTeste {

    @Spy
    private Conta conta = new Conta(1_000);

    @Test //Valida se o objeto está seguindo a ordem que eu quero
    void validarOrdemChamada() {

        conta.pagaBoleto(300);


        InOrder inOrder = Mockito.inOrder(conta); //Observa a ordem em que as coisas ocorrem na classe
        inOrder.verify(conta).pagaBoleto(300);
        inOrder.verify(conta).validaSaldo(300);
        inOrder.verify(conta).debita(300);
        inOrder.verify(conta).enviaCreditoParaEmissor(300);
    }

    @Test //Verifica a quantidade de vezes que o comando foi chamado
    void validarQuantidadeChamadas() {

        conta.validaSaldo(300);
        conta.validaSaldo(300);
        conta.validaSaldo(300);
        conta.validaSaldo(300);

        Mockito.verify(conta, Mockito.times(4)).validaSaldo(ArgumentMatchers.anyInt());
    }

    @Test
    void trueValidacaoSaldo() {
        Mockito.doNothing().when(conta).validaSaldo(ArgumentMatchers.anyInt());
        conta.validaSaldo(3_500);
    }

}
