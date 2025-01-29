import java.util.Scanner;
public class Esercizio4_8
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	    System.out.println("Scrivi una frase nn troppo lunga");
	    String frase = input.nextLine().toLowerCase();
	    int spazi = 0;

	    for(int i = 0; i < frase.length(); i++){

	        char lettere = frase.charAt(i);

	        if(lettere == ' '){
	            spazi++;
	        }
	    }
        System.out.println("Il numero di spazi nella tua frase è: " + spazi);

	}
}