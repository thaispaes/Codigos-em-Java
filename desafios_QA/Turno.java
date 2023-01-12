import java.util.Scanner;
public class Turno {
    Scanner leitor = new Scanner(System.in);

        char turno = leitor.next().toUpperCase().charAt(0);
        
        if (turno == 'M'){
            System.out.println("Bom Dia!");
        } else {
            if (turno == 'V'){
                System.out.println("Boa Tarde!");
            } else {
                if (turno == 'N'){
                    System.out.println("Boa noite!");
                } else {
                    System.out.println("Valor inválido!");
                }
            }
        }
}
