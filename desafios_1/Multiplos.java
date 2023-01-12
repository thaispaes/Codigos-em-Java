package desafios_1;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int valorA= leitor.nextInt();
        System.out.println("Informe o segundo valor: ");
        int valorB= leitor.nextInt();
        if (valorA % valorB == 0 || valorB % valorA == 0) {
            System.out.println("Os valor são Multiplos");
        } else {
            System.out.println("Os valores não são Multiplos");
        }
    }
}
