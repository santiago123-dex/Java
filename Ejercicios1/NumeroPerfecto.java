import java.util.Scanner;

public class NumeroPerfecto {
    public static void numeroPerfecto() {    
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        int suma = 0;

        for(int i= 1; i<numero; i++){
            if(numero % i == 0){
                suma += i;
            }
        }
        if(suma == numero){
            System.out.println("El numero es perfecto");
        }else{
            System.out.println("El numero no es perfecto");
        }

        scanner.close();
    }
}
