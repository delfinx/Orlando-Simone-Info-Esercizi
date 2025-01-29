import java.util.Scanner;

public class Esercizio5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserire 2 numeri");
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();
        System.out.println(confronta(numero1, numero2));

    
    }
    public static int confronta(int a, int b){
        int risultato = 0;
        if(a > b){
            risultato = a - b;
        }
        else if(a < b){
            risultato = b - a;
        }
        return risultato;
    }

}