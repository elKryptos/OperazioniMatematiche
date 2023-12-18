import java.util.Scanner;

public class OperazioniMatematiche {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
         
         System.out.println("Inserisce il primo numero");
         int num1 = scanner.nextInt();
         System.out.println("Hai inserito il seguente numero: " + num1);

         System.out.println("Inserisce il secondo  numero");
         int num2 = scanner.nextInt();
         System.out.println("Hai inserito il seguente numero: " + num2);

         int somma = num1 + num2;

         System.out.println("Il risultato della somma è: " + somma);
         System.out.println("Il risultato della sottrazione è: " + sottrazione(num1, num2));
         System.out.println("Il risultato della prodotto è: " + prodotto(num1, num2));
         scanner.close();
    }
       public static int sottrazione(int num1, int num2){
        return num1 - num2;
       }
       public static int prodotto (int num1, int num2){
        return num1 * num2;
    }

}