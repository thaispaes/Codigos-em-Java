import java.util.ArrayList;
import java.util.Scanner;

public class FilaBanco {

    public static void main(String[] args) {
        ArrayList<String> nomesFila = new ArrayList();
        Scanner nome = new Scanner(System.in);
        int i;

        for (i=0; i<3; i++){
            int cont = i;
            nomesFila.add(nome.next());
            System.out.println(nomesFila.get(i) + " - esta na posicao: "+ (cont+=1));
        }
    }

}