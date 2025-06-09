import java.util.Scanner;

public class ParOuImpar {

    public static String verificarParOuImpar(int num) {
        if (num % 2 == 0) {
            return "Par";
        }  else {
            return "Impar";
        }
    }


   public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite um número: ");
       int numero = scanner.nextInt();

       String resultado = verificarParOuImpar(numero);
           System.out.println("O número " + numero + " é " + resultado + ".");

           System.out.println("O número " + numero + " é IMPAR.");

       scanner.close();
   }

}
