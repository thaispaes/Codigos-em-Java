import java.util.Scanner;

public class Media {
        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();
        
        float media = ((idade1+idade2+idade3)/3);
        
        if (media <26) {
          System.out.println("Jovem!");
        }else{ 
            if (media <60) {
                System.out.println("Adulta!");
              }else{
                if (media >60) {
                    System.out.println("Idosa!");
                  }
              }
        }
}