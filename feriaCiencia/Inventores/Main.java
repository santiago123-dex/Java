import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Inventor> inventores = new ArrayList<>();
        boolean salir = false;
        while (!salir) {
            System.out.println("---Menu de Inventores");
            System.out.println("1). Registrar Inventor");
            System.out.println("2). Agregar puntos");
            System.out.println("3). Mostrar datos");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Tipo de inventor: 1) Mecánico 2) Programador 3) Químico");
                    int tipoDesempeño = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese su edad: ");
                    String edad = scanner.nextLine();
                    System.out.print("Ingrese su nivel de creatividad (número): ");
                    int nivelCreatividad = scanner.nextInt();
                    scanner.nextLine();
                    switch (tipoDesempeño) {
                        case 1:
                            inventores.add(new Mecanico(nombre, edad, nivelCreatividad));
                            break;
                        case 2:
                            inventores.add(new Programador(nombre, edad, nivelCreatividad));
                            break;
                        case 3:
                            inventores.add(new Quimico(nombre, edad, nivelCreatividad));
                            break;
                        default:
                            System.out.println("Tipo no válido.");
                    }
                    System.out.println("Inventor registrado correctamente.\n");
                    break;
                case 2:
                    System.out.println("Ingrese la persona");
                    for (int i = 0; i < inventores.size(); i++) {
                        System.out.println(i + ")" + inventores.get(i).getNombre());
                    }
                    System.out.println("Seleccione el número de la persona a la que quiere añadir puntos:");
                    int indice = scanner.nextInt();
                    System.out.println("Cuanto puntos quiere añadir a la calificacion");
                    int puntos = scanner.nextInt();
                    if (indice < 0 || indice >= inventores.size()) {
                        System.out.println("Índice no válido.");
                    } else if (puntos > 100) {
                        System.out.println("No se puede agregar mas de 100 puntos en total");
                    } else {
                        inventores.get(indice).agregarPuntaje(puntos);
                    }
                    break;
                case 3:
                    if (inventores.size() == 0) {
                        System.out.println("No hay inventores registrados");
                    }
                    for (Inventor inventor : inventores) {
                        System.out.println("----------");
                        System.out.println(inventor.getClass().getSimpleName());
                        inventor.mostrarDatos();
                        System.out.println("----------");
                    }
                default:
                    break;
            }
        }
    }
}