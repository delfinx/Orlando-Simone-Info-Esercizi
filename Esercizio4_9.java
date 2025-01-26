import java.util.Scanner;
public class Esercizio4_9
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci una parola");
		String risposta = input.nextLine().toLowerCase();
		char nomeInvertito;
		String nomeCompleto = "";
		int incrementatoreParola = 0;

		for(int i = 0; i < risposta.length(); i++){
		    int lunghezzaNome = risposta.length();
		    incrementatoreParola++;
		    nomeInvertito = risposta.charAt(lunghezzaNome - a);
		    nomeCompleto += nomeInvertito;
		    System.out.println(nomeCompleto);
		}

	}
}