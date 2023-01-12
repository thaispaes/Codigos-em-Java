package curso.dio.junit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

/*
* Outros
* @TestMethodOrder(MethodOrderer.Random.class)
* @TestMethodOrder(MethodOrderer.MethodName.class)
* @TestMethodOrder(MethodOrderer.DisplayName.class) @DisplayName("name")
* */

public class OrdenandoTestes {

    @Order(2)
    @Test
    void fluxoA() {
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void fluxoB() {
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void fluxoC() {
        Assertions.assertTrue(true);
    }
}
