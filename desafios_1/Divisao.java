package desafios_1;

import java.util.Scanner;
public class Divisao {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a quantidade de calculos: ");
        int N = leitor.nextInt();
        float X, Y;
        for (int i = 0; i < N; i++) {
            System.out.println("\n Informe o "+(i+1)+"º de X: ");
            X = leitor.nextInt();
            System.out.println("Informe o "+(i+1)+"º de Y: ");
            Y = leitor.nextInt();
            if (X < 0) System.out.println("Sua divisão é impossivel");
            else System.out.println("Resultado da divisão = "+(X / Y));
        }
    }

}
