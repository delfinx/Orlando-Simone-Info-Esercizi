import java.util.Scanner;

public class Progetto5_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mese = {
                "gennaio", "febbraio", "marzo", "aprile",
                "maggio", "giugno", "luglio", "agosto",
                "settembre", "ottobre", "novembre", "dicembre"
        };


        System.out.println("Inserisci il tuo mese di nascita in lettere: ");
        String meseNascita = input.nextLine().toLowerCase();

        System.out.println("Inserisci il tuo giorno di nascita: ");
        int giornoNascita = input.nextInt();

        boolean meseValido = true;

        for (String m : mese) {
            if (m.equals(meseNascita)) {
                meseValido = true;
                break;
            }
        }

        if (!meseValido) {
            System.out.println("Il mese inserito non esiste");
            return;
        }

        String risultato = determinaSegnoZodiacale(giornoNascita, meseNascita);

        System.out.println(risultato);
    }

    public static String determinaSegnoZodiacale(int giornoDiNascita, String meseScelto) {

        int[] giorniMese = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] mesi = {"gennaio", "febbraio", "marzo", "aprile",
                         "maggio", "giugno","luglio", "agosto",
                         "settembre", "ottobre", "novembre", "dicembre"};
        String risultato = "";

        int indiceMese = -1;
        for (int i = 0; i < mesi.length; i++) {
            if (mesi[i].equals(meseScelto)) {
                indiceMese = i;
                break;

            }
        }

        if (indiceMese == 1 && giornoDiNascita > 29) {
            return "Il giorno inserito non esiste";
        }
        else if (giornoDiNascita < 1 || giornoDiNascita > giorniMese[indiceMese]) {
            return "Il giorno inserito non esiste";
        }

        String segno = "";
        switch (meseScelto) {
            case "gennaio":
                segno = (giornoDiNascita <= 19) ? "Capricorno" : "Acquario";
                break;
            case "febbraio":
                segno = (giornoDiNascita <= 18) ? "Acquario" : "Pesci";
                break;
            case "marzo":
                segno = (giornoDiNascita <= 20) ? "Pesci" : "Ariete";
                break;
            case "aprile":
                segno = (giornoDiNascita <= 19) ? "Ariete" : "Toro";
                break;
            case "maggio":
                segno = (giornoDiNascita <= 20) ? "Toro" : "Gemelli";
                break;
            case "giugno":
                segno = (giornoDiNascita <= 20) ? "Gemelli" : "Cancro";
                break;
            case "luglio":
                segno = (giornoDiNascita <= 22) ? "Cancro" : "Leone";
                break;
            case "agosto":
                segno = (giornoDiNascita <= 22) ? "Leone" : "Vergine";
                break;
            case "settembre":
                segno = (giornoDiNascita <= 22) ? "Vergine" : "Bilancia";
                break;
            case "ottobre":
                segno = (giornoDiNascita <= 22) ? "Bilancia" : "Scorpione";
                break;
            case "novembre":
                segno = (giornoDiNascita <= 21) ? "Scorpione" : "Sagittario";
                break;
            case "dicembre":
                segno = (giornoDiNascita <= 21) ? "Sagittario" : "Capricorno";
                break;
        }

        return "Il tuo segno zodiacale è: "+ segno;
    }
}