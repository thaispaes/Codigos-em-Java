package projeto_banco;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List contas = new ArrayList<>();

    public Cliente(String nome){
        this.nome = nome;
    }

    public void dadosCliente(Contas conta){
        contas.add("Dados conta:");
        contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contas> getContas() {
        return contas;
    }

    public void setContas(List<Contas> contas) {
        this.contas = contas;
    }

}
