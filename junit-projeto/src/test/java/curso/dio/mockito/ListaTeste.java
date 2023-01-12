package curso.dio.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

    //O Mockito mocka dados na lista para que nosso teste seja realizado
    @Mock
    private List<String> letras;

    @Test
    void adicionarItem() {
        Mockito.when(letras.get(0)).thenReturn("B");

        Assertions.assertEquals("B", letras.get(0));
    }
}
