package curso.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void validarCalculoIdade() {
        Pessoa pessoa = new Pessoa( "Julia", LocalDate.of(2020,1,1));
        Assertions.assertEquals(3, pessoa.getIdade());
    }
    @Test
    void verificarMaioridade(){
        Pessoa pessoa = new Pessoa( "Maria", LocalDate.of(2020,1,1));
        Assertions.assertFalse(pessoa.ehMaiorDeIdade());
    }

}
