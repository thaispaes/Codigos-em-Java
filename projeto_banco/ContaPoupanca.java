package projeto_banco;

public class ContaPoupanca extends Contas{

    protected ContaPoupanca(int agencia, int conta, double saldo, Cliente cliente, Banco banco) {
        super(agencia, conta, saldo, cliente,banco);
    }

    protected void sacar(double valor) {
        setSaldo(getSaldo()-valor);
        System.out.println("Saque realizado com sucesso");
    }

    @Override
    protected void depositar(double valor) {
        setSaldo(getSaldo()+valor);
        System.out.println("Deposito realizado com sucesso");
    }

    @Override
    protected void tranferir(double valor, Contas contaDestino) {
        setSaldo(getSaldo()-valor);
        contaDestino.setSaldo(getSaldo()+valor);
        System.out.println("Transferência realizada com sucesso");
    }

    protected void extratoConta(){
        extrato("Poupança");
    }
}
