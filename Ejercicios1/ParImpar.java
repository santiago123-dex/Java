import java.util.Scanner;

public class ParImpar {
    public static void parImpar() {
        Scanner scanner = new Scanner(System.in);

        int par= 0;
        int impar = 0;
        
        
        for(int i = 1; i <= 10; i++){
            System.out.print("Ingrese 10 numeros");
            int numero = scanner.nextInt();
            
            if(numero % 2 == 0){
                par++;
                System.out.println("El numero es par");
            }else{
                impar++;
                System.out.println("El numero es impar");
            }
        }

        System.out.println("La cantidad de numeros pares es: " + par);
        System.out.println("La cantidad de numeros impares es: " + impar);


        scanner.close();
    }
}
