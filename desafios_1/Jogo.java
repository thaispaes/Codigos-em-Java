package desafios_1;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int inicio, fim;
        inicio = scan.nextInt();
        fim = scan.nextInt();
        if(inicio > fim){
            System.out.print("O JOGO DUROU " +(24 - (inicio-fim))+ " HORA(S)\n");
        }else if(fim > inicio){
            System.out.print("O JOGO DUROU " + (fim-inicio) + " HORA(S)\n");
        }else{
            System.out.print("O JOGO DUROU 24 HORA(S)\n");
        }
    }
}
