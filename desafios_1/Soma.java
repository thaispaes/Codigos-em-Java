package desafios_1;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int A, B, soma;
        System.out.println("Insira o primeiro valor: ");
        A = sc.nextInt();
        System.out.println("Insira o segunda valor: ");
        B = sc.nextInt();
        System.out.println("A soma dos valores é: " +A+B);

        sc.close();
    }

}

/*Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de SOMA.
A seguir escreva o valor desta variável.*/
