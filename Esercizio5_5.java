import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continua = true;

        while (continua) {
            System.out.println("Inserisci una stringa o frase:");
            String fraseInserita = input.nextLine().toLowerCase();

            int numeroVocali = ContaVocali(fraseInserita);

            if (numeroVocali <= 5) {
                System.out.println("Inserisci un'altra frase.");
            }

            else {
                continua = false;
            }
        }
        System.out.println("La frase ha più di 5 vocali");

    }

    public static int ContaVocali(String stringa) {
        int incremento = 0;
        for (int i = 0; i < stringa.length(); i++) {
            char carattere = stringa.charAt(i);
            if (carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u') {
                incremento++;
        }

    }
    return incremento;
    }

}