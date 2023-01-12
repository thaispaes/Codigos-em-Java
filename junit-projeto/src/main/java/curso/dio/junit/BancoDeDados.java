package curso.dio.junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        //Conectou
        LOGGER.info("Iniciou Conexão");
    }

    public static void fecharConexao(){
        //Desconectou
        LOGGER.info("Fechou Conexão");
    }

    public static void inserirDados(Pessoa pessoa){
        //Insere pessoa no DB
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        //Insere pessoa no DB
        LOGGER.info("Removeu dados");
    }

}
