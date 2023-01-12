package metodos;

import java.util.Scanner;

public class Calculadora {
    public static void calculos(double valor1, double valor2) {
        double resultado = valor1 + valor2;
        System.out.println(" A Soma dos valores é: " + resultado);
        resultado = valor1 - valor2;
        System.out.println(" A Subtração dos valores é: " + resultado);
        resultado = valor1 / valor2;
        System.out.println(" A Divisão dos valores é: " + resultado);
        resultado = valor1 * valor2;
        System.out.println(" A Multiplicacao dos valores é: " + resultado);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double valor1, valor2;
        int OK = 1;

        System.out.println(" Calculadora ");
        do {
            System.out.println(" Informe o primeiro valor: ");
            valor1 = read.nextDouble();
            System.out.println(" Informe o segundo valor: ");
            valor2 = read.nextDouble();
            valor2 = read.nextDouble();
            if (valor1 == 0) {
                System.out.println("O valor não pode ser igual a zero \n" +
                        "Informe um valor válido \n \n");
            } else if (valor2 == 0) {
                System.out.println("O valor não pode ser igual a zero \n" +
                        "Informe um valor válido \n \n");
            } else {
                OK = 0;
            }
        } while (OK == 1);
        calculos(valor1, valor2);
    }


}
