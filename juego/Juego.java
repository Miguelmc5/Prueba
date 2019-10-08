package juego;
import java.util.*;

public class Juego {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x=(int)(Math.random()*10);
	
	Scanner lectura=new Scanner(System.in);
	int numeros;
	int intentos=0;
	while(intentos<5)
	{
	System.out.println("Dime un número: ");
	numeros=lectura.nextInt();	
		if(numeros==x)
		{
			System.out.println("Eres un tonto con suerte");
			break;
		}
		if(numeros<x)
			{
				System.out.println("Te quedaste corto loco");	
			}
		
		if(numeros>x)
		{
			System.out.println("Te pasaste animal");	
		}
		intentos++;
	}
	if(intentos==5)
	{
		System.out.println("Perdiste tonto");
	}                                                        
              
       
        
    }
    
}
