import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Registro de Vehiculos-------");
        System.out.println("Ingrese el tipo de vehiculo(carro/moto/bicicleta):");
        String tipo = scanner.nextLine().toLowerCase();

        System.out.println("Ingrese la marca: ");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el modelo");
        String modelo = scanner.nextLine();

        System.out.println("Ingrese la velocidad maxima");
        int velocidadMaxima = scanner.nextInt();
        
        Transporte vehiculo;

        switch (tipo) {
            case "carro":
                vehiculo = new Carro(marca, modelo, velocidadMaxima);
                break;
            case "moto":
                vehiculo = new Moto(marca, modelo, velocidadMaxima);
                break;
            case "bicicleta":
                vehiculo = new Bicicleta(marca, modelo, velocidadMaxima);
                break;
            default:
                System.out.println("Tipo de vehiculo no encontrado");
                return;
        }

        System.out.println("\n--- Información del vehiculo ---");
        vehiculo.arrancar();
        vehiculo.detener();
        vehiculo.tipoCombustible();
        vehiculo.mostrarInformacion();

        scanner.close();
    }
}