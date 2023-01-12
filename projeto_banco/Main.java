package projeto_banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Thais");
        Cliente cliente2 = new Cliente("Flaviane");
        Banco banco1 = new Banco("Bradesco");
        Banco banco2 = new Banco("Santander");
        ContaCorrente cc = new ContaCorrente(2345,23456,235.90,cliente2,banco1);
        ContaPoupanca cp = new ContaPoupanca(2431,43567,670.90,cliente1,banco2);

        cc.sacar(140.00);
        cp.tranferir(190, cc);
        cc.extratoConta();
        cp.extratoConta();
    }





}
