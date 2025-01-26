import java.util.Scanner;
public class Esercizio3_3
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci una risposta di tipo si o no");
		String risposta = input.nextLine().toLowerCase();

		boolean accettato;
		if(risposta.equals("si") || risposta.equals("s")){
		    accettato = true;
		}
		else{
		    accettato = false;
		}

		System.out.println(accettato);
		System.out.println("Per accettare qualsiasi risposta relativa alla grandezza del carattere basta inserire un controllo come lowercase o uppercase");



	}
}