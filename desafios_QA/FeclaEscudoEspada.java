import java.util.Scanner;
public class teste {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int jogadaJogador = leitor.nextInt();
        int jogadaInimigo = leitor.nextInt();

        if (jogadaInimigo == 1 && jogadaJogador == 1) System.out.println("Empatou");
        else if (jogadaInimigo == 1 && jogadaJogador == 2) System.out.println("Ganhou");
        else if (jogadaInimigo == 1 && jogadaJogador == 3) System.out.println("Perdeu");
        else if (jogadaInimigo == 2 && jogadaJogador == 2) System.out.println("Empatou");
        else if (jogadaInimigo == 2 && jogadaJogador == 1) System.out.println("Perdeu");
        else if (jogadaInimigo == 2 && jogadaJogador == 3) System.out.println("Ganhou");
        else if (jogadaInimigo == 3 && jogadaJogador == 3) System.out.println("Empatou");
        else if (jogadaInimigo == 3 && jogadaJogador == 2) System.out.println("Perdeu");
        else if (jogadaInimigo == 3 && jogadaJogador == 1) System.out.println("Ganhou");

    }

}
