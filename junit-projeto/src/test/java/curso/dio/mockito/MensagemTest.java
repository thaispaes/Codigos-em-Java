package curso.dio.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MensagemTest {

   @Spy //Ele vai visualizar o comportamento do comando que você informar
   // Ele instancia o comportamento da classe
   private EnviarMensagem enviarMensagem;

   @Test
    void verificarComportamento() {
       Mockito.verifyNoInteractions(enviarMensagem);

       Mensagem mensagem = new Mensagem("Hello WOrld");
       enviarMensagem.adicionarMensagem(mensagem);

       Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);
       //Verifica se nesse objeto a msg foi enviada

      Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());
   }

}
