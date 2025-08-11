import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nota");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese su nota");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese su nota");
        int numero3 = scanner.nextInt();

        System.out.println( "El promedio de sus notas es: " + (numero1 + numero2 + numero3) / 3);

        scanner.close();
    }
}
