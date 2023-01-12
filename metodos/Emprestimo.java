package metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Emprestimo {
    static Scanner scan = new Scanner(System.in);
    static DecimalFormat format = new DecimalFormat("0.00");

    static double taxa;

    public static double getParcelas(int parcela){
        if (parcela==2){
            taxa=0.05;
        }
        if (parcela==3){
            taxa=0.10;
        }
        if (parcela==5){
            taxa=0.15;
        }
        return taxa;
    }

    public static void main(String[] args) {
        int parcela;
        double emprestimo;
        System.out.println("Informe o valor do emprestimo:");
        emprestimo = scan.nextDouble();
        System.out.println(" Informe a quantidade de parcelas: ");
        parcela = scan.nextInt();
        System.out.println(" A taxa em cima do valor vai ser de "+getParcelas(parcela)+"% \n");
        System.out.println(" O valor do seu emprestimo vai ser R$" +format.format((emprestimo * taxa) + emprestimo) +
                "\n Em " + parcela +" vezes de R$ " + format.format(emprestimo / parcela));
    }

}
