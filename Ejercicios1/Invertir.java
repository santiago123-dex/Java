import java.util.Scanner;

public class Invertir {
    public static void invertir() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero");
        int numero = scanner.nextInt();
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        System.out.println("El numero invertido es: " + invertido);

        scanner.close();
    }
}
