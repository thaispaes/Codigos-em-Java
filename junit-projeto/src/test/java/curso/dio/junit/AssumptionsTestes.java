package curso.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTestes {

    @Test
    void validarAlgoNoUserThais() {
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }

    //Vai pressumir que aquilo só vai ser executado com determinada circunstancia,
    //Como acima, que só vai rodar o teste de Assertions se o Usuario for Thais
}
