import java.util.Scanner;

public class Esercizio5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci 2 stringhe");
        String stringa1 = input.nextLine().toLowerCase();
        String stringa2 = input.nextLine().toLowerCase();

        if(stringa1.length() == stringa2.length()){
            char carattereStringa_due = stringa2.charAt(0);
            System.out.println(trova(stringa1, carattereStringa_due));
        }

        else{
            char carattereStringa_uno = stringa1.charAt(stringa1.length() - 1);
            System.out.println(trova(stringa2, carattereStringa_uno));
        }

    }

    public static boolean trova(String stringa, char lettera){

        boolean verita = true;
        for(int i = 0; i < stringa.length(); i++){
            char caratteri = stringa.charAt(i);
            if(caratteri == lettera){
                i = stringa.length();
                verita = true;
            }
            else{
                verita = false;
            }
        }
        return verita;
    }



}