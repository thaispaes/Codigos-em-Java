package curso.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class OutrosAssertions {

    @Test
    void validarArrays() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {-1, 5, 2, 5, 19, 17};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarObjetoNulo() {
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.now());

        Assertions.assertNull(pessoa);
    }

    @Test
    void validarTipoNumeros() {
        double valor = 5.0;
        double outroValor = 6.0;

        Assertions.assertEquals(valor, outroValor);
    }



}

