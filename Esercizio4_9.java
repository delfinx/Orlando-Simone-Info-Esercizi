import java.util.Scanner;
public class Esercizio4_9
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci una parola");
		String risposta = input.nextLine().toLowerCase();
		String nomeCompleto = "";

		for(int i = 0; i < risposta.length(); i++){
		    int lunghezzaNome = risposta.length();
		 
		    char nomeInvertito = risposta.charAt(risposta.length() - i - 1);
		    nomeCompleto += nomeInvertito;
		    System.out.println(nomeCompleto);
		}

	}
}