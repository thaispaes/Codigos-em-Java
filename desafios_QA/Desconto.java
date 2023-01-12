import java.util.Scanner;

public class Desconto {
   
		
    Scanner input = new Scanner(System.in);
		
    int M = input.nextInt();
    int S = input.nextInt();  
    
    float percentual = ((S*100)/M)
    
    System.out.println("O desconto foi de "+percentual);
    
    
}
