package curso.dio.junit;

import java.time.LocalDate;

public class Conta {

    private int conta;
    private int valor;

    public Conta(int conta, int valor){
        this.conta = conta;
        this.valor = valor;
    }

    public int getConta() { return conta; }
    public int getValor() { return valor; }
}
