import java.util.Scanner;

public class NumerosPrimos {
    public static void numeroPrimo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero");
        int numero1 = scanner.nextInt();

        boolean primo = true;

        if(numero1 <= 1){
            primo = false;
        }else{
            for(int i = 2; i < numero1; i++){
                if(numero1 % i == 0){
                    break;
                }
            }

        }

        if (primo) {
            System.out.println(numero1 + " El numero es primo");
        } else {
            System.out.println(numero1 + " El numero no es primo");
        }

        scanner.close();
    }
}
