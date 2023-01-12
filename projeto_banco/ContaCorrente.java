package projeto_banco;

public class ContaCorrente extends Contas{

    protected ContaCorrente(int agencia, int conta, double saldo, Cliente cliente, Banco banco) {
        super(agencia, conta, saldo,cliente,banco);
    }

    @Override
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
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Transferência realizada com sucesso");
    }

    protected void extratoConta(){
        extrato("Corrente");
    }
}
