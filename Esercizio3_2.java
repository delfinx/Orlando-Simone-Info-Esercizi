import java.util.Scanner;
public class Esercizio3_2
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int x = input.nextInt();

        if(x % 2 == 0)
        x /= 2;
        
        else
        x = x*3 - 1;

        System.out.println(x);
    }
}
