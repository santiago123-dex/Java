import java.util.Scanner;

public class Multiplos {
    public static void multiplos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero");
        int numero1 = scanner.nextInt();

        for(int i= 1; i <= numero1; i++){
            if( i% 3 == 0){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
