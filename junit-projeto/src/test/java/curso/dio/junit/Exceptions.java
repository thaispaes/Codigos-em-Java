package curso.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exceptions {

    @Test
    void validarCenario() {
        Conta contaOrigem = new Conta(123456, 0);
        Conta contaDestino = new Conta(456789, 100);

        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();
        Assertions.assertThrows(IllegalArgumentException.class , () ->
                transferencia.transfere(contaOrigem, contaDestino, -1));
    }

    void validarCenarioNEgativo() {
        Conta contaOrigem = new Conta(123456, 0);
        Conta contaDestino = new Conta(456789, 100);

        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

       // Assertions.assertDoesNotThrows(() -> transferencia.transfere(contaOrigem, contaDestino, -1));
    }


}
