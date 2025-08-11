import java.util.Scanner;

public class SumarDigitos {
    public static void sumarDigitos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero");
        int numero = scanner.nextInt();
        int suma = 0;

        while (numero > 0) {
            int digito = numero % 10;
            suma += digito;
            numero /= 10;
        }
        System.out.println("La suma de los digitos es: " + suma);

        scanner.close();
    }
}
