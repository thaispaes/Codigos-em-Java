package curso.dio.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class MockObjetos {

    @Mock
    private ApidosCorreios apidosCorreios;

    @InjectMocks //Injeta as informações do Mock da API na classe
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarCadastro() {
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("PE", "Recife", "Rua 1",
                "Casa", "Encruzilhada");

        Mockito.when(apidosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(dadosLocalizacao);

        Pessoa thais = cadastrarPessoa.cadastrarPessoa("Thais", "52041050",
                LocalDate.of(2002,02,04), "56450-905");

        Assertions.assertEquals("Thais", thais.getNome());
        Assertions.assertEquals("52041050", thais.getDocumento());
        Assertions.assertEquals("Recife", thais.getEndereco().getCidade());
        Assertions.assertEquals("PE", thais.getEndereco().getUf());



    }


    @Test
    void vexceptionApiDosCorreios() {
        Mockito.when(apidosCorreios.buscaDadosComBaseNoCep(anyString())).thenThrow(RuntimeException.class);
        /* Outra opção
        Mockito.doThrow(IllegalArgumentException.class)
        .when(apidosCorreios)
                .buscaDadosComBaseNoCep(anyString())
        */
        Assertions.assertThrows(RuntimeException.class, () -> cadastrarPessoa.cadastrarPessoa("José", "28578527976", LocalDate.of(1947, 1, 15), "69317300"));
    }


}
