import java.util.Scanner;

public class ContadorDigitos {
    public static void contarDigitos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero");
        int numero = scanner.nextInt();
        int contador = 0;

        if(numero == 0){
            contador = 1;
            }else{
                while (numero != 0) {
                    numero = numero /10;
                    contador ++;
                }
        }

        System.out.println("El numero tiene " + contador + " digitos");

        scanner.close();
    }
}
