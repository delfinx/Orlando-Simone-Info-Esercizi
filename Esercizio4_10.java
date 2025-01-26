import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int lanciTotali = 8;
		double croce = 0;
		double testa = 0;
		int incremento = 1;

		for(int i = 0; i < lanciTotali; i++){

		    int moneta = (int)(Math.random()*2+1);

		    if(moneta == 1){
		        System.out.println(incremento + " lancio: " + 't');
		        testa++;
		        incremento++;
		    }
		    else {
		        System.out.println(incremento + " lancio: " + 'c');
		        croce++;
		        incremento++;
		    }
		}

		double calcoloTesta = testa / lanciTotali * 100;
		double calcoloCroce = croce / lanciTotali * 100;
		System.out.println("Percentuale di teste: " + calcoloTesta);
		System.out.println("Percentuale di croci: " + calcoloCroce);


	}
}