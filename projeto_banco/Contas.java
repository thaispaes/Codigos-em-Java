package projeto_banco;

abstract class Contas {
    private int agencia;
    private int conta;
    private double saldo;
    private Cliente cliente;
    private Banco banco;

    protected Contas(){

    }

    protected Contas(int agencia, int conta, double saldo, Cliente cliente, Banco banco) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.banco = banco;
    }

    protected abstract void sacar(double valor);
    protected abstract void depositar(double valor);
    protected abstract void tranferir(double valor, Contas contaDestino);
    protected void extrato(String tipoConta){
        System.out.println(("===== Extrato Conta "+tipoConta+"   ====="));
        System.out.println("Titular: "+this.cliente.getNome());
        System.out.println("Agência: "+getAgencia());
        System.out.println("Conta: "+getConta());
        System.out.println(String.format("Saldo: %.2f",getSaldo()));
        System.out.println("Banco: "+this.banco.getNome());
        System.out.println("\n");
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}


