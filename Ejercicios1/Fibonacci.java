import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero");
        int numero = scanner.nextInt();

        scanner.close();

        int numero1 = 0;
        int numero2 = 1;

        for(int i = 0; i < numero; i++){
            System.out.println(numero1);
            int next = numero1 + numero2; 
            numero1 = numero2;
            numero2 = next;
        }

    }
}
