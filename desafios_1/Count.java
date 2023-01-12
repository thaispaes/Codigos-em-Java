package desafios_1;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a quantidade de verificações: ");
        int count = scan.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Informe o "+(i+1)+
                    "º valor: ");
            String A = scan.next();
            System.out.println("Informe o "+(i+1)+
                    "º valor para comparação: ");
            String B = scan.next();
            if (A.endsWith(B)) System.out.println("Os valores encaixam");
            else System.out.println("Os valores não encaixam");
        }

    }

}
