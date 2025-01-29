import java.util.Scanner;
public class Esercizio6_1
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int[] giorni = new int[10];
        int incremento = 1;
        int media = 0;
        for(int i = 0; i < giorni.length; i++){
                System.out.println("Inserisci una temperatura > giorno " + incremento + " : " );
                giorni[i] = input.nextInt();
                media += giorni[i];
                incremento++;
            }

        media /= 10;
        System.out.println("La media delle temperature è: " + media);

        for(int i = 0; i < giorni.length; i++){
                if(media > giorni[i]){
                        System.out.println("Questa temperatura è al di sotto della media: " + giorni[i]);
                    }
            }
    }


}