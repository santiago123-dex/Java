import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Escribe la opcion que quieras ejecutar
                1). Numero primo
                2). Contador de digitos
                3). Suma de digitos
                4). Invertir el numero
                5). Multiplos de 3
                6). Numero perfecto
                7). Fibonacci
                8). Par o impar


                """);
        int opcion = scanner.nextInt();

        

        switch (opcion) {
            case 1:
                NumerosPrimos.numeroPrimo();
                break;
            case 2:
                ContadorDigitos.contarDigitos();
                break;
            case 3:
                SumarDigitos.sumarDigitos();
                break;
            case 4:
                Invertir.invertir();
                break;
            case 5:
                Multiplos.multiplos();
                break;
            case 6:
                NumeroPerfecto.numeroPerfecto();
                break;
            case 7:
                Fibonacci.fibonacci();
                break;
            case 8:
                ParImpar.parImpar();
                break;

            default:
                break;
        }
        scanner.close();
    }
}
