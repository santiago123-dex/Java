package mainbanco;
import java.util.Scanner;

import bancario.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        /*Crea cuenta para el usuario*/
        System.out.println("Ingrese el nombre del titular de la cuenta:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el número de cuenta:");
        String numero = sc.nextLine();

        System.out.println("Ingrese el saldo inicial");
        double saldo = sc.nextDouble();

        CuentaBancaria cuenta1 = new CuentaBancaria(nombre, numero, saldo);

        CuentaBancaria cuenta2 = new CuentaBancaria("Santiago", "423124123", 100.000);

        /* Menu de opciones*/

        int opcion;

        do{
            System.out.println("""
            Menu de opciones:
            1. Mostrar información de la cuenta
            2. Depositar dinero
            3. Retirar dinero
            4. Transferir a otra cuenta
            5. Salir
            """);



            System.out.println("Ingrese una opción: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Ingrese una opción válida");
                sc.next();
                System.out.println("Ingrese una opción: ");
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Información de la cuenta:");
                    cuenta1.mostrarInformacion();
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a depositar");
                    double dep = sc.nextDouble();
                    cuenta1.depositar(dep);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a retirar");
                    double ret = sc.nextDouble();
                    cuenta1.retirar(ret);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad que quiere transferir");
                    double tran = sc.nextDouble();
                    cuenta1.transferir(cuenta2, tran);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema....");
                    break;
                default:
                    break;
            }
        }while(opcion != 5);

        sc.close();
    }
}
