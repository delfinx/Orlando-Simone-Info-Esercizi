import java.util.Scanner;
public class Esercizio3_1
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int numero = input.nextInt();

        if(numero > 0 && numero < 100)
        System.out.println(true);
        else
        System.out.println(false);


    }
}
