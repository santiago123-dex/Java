import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Elegir vehículo ---
        System.out.println("Elige el tipo de vehículo:");
        System.out.println("1. Vehículo genérico");
        System.out.println("2. Auto");
        System.out.println("3. Moto");
        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Escribe la marca del vehículo: ");
        String marca = sc.nextLine();

        Vehiculo v;
        if (opcion == 1) {
            v = new Vehiculo(marca);
        } else if (opcion == 2) {
            v = new Auto(marca);
        } else {
            v = new Moto(marca);
        }

        // --- Menú de acciones ---
        int eleccion;
        do {
            System.out.println("\n¿Qué deseas hacer?");
            System.out.println("1. Acelerar");
            System.out.println("2. Frenar");
            System.out.println("3. Salir");
            eleccion = sc.nextInt();

            if (eleccion == 1) {
                v.acelerar();
            } else if (eleccion == 2) {
                v.frenar();
            }

        } while (eleccion != 3);

        System.out.println("¡Adios!");
        sc.close();
    }
}
