package curso.dio.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnvioEmailTest {

    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private EnvioEmail servico;

    @Captor
    private ArgumentCaptor<Email> captor; //Ele captura informações e recolhe os argumentos para o teste

    @Test
    void validarDadosEnviados(){

        String email = "usuario@teste.com";
        String mensagem = "Teste Olá";
        boolean ehFormatoHTML = false;

        servico.enviaEmail(email, mensagem, ehFormatoHTML);

        Mockito.verify(plataforma).enviaEmail(captor.capture());

        Email emailcapturado = captor.getValue();

        Assertions.assertEquals(email, emailcapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailcapturado.getMensagem());
        Assertions.assertEquals(Formato.TEXTO, emailcapturado.getFormato());

    }


}
