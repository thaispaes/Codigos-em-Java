package curso.dio.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class TestarConexao {

    @BeforeAll //Informa que antes de tudo deve se fazer uma ação
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    // O Each determina que a cada teste ele vai realizar essa ação 
    @BeforeEach
    void insereDados() {
        BancoDeDados.inserirDados(new Pessoa("Thais", LocalDate.of(2002,02,04)));
    }

    @AfterEach
    void removeDados() {
        BancoDeDados.removeDados(new Pessoa("Thais", LocalDate.of(2002,02,04)));
    }

    @Test
    void validarDadoRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll //Mesma lógica do Before
    static void finalizarConexao() {
        BancoDeDados.fecharConexao();
    }
}
