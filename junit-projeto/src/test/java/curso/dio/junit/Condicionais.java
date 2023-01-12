package curso.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;

public class Condicionais {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "THais")
    void validarAlgoNoUserThais() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "Junior")
    void validarAlgoNoUser() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    //@EnabledOnOs(OS.WIN) De acordo com o Sistema Operacional
    void validarCasoOS() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
        //@EnabledOnOs({OS.WIN, OS.MAC}) De acordo com o Sistema Operacional
    void validarCasoOSs() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    //@EnabledOnJre(JAVA_17)
    void casoSejaJavaTal() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
        //@EnabledOnJre(min = JAVA_11, max= JAVA_17)
    void casoSejaJavaTalETal() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
