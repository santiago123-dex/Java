import java.util.ArrayList;
import usuarios.Usuario;
import biblioteca.Biblioteca;
import java.util.Scanner;

public class Main {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static Biblioteca biblioteca = new Biblioteca();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE LOGIN Y REGISTRO =====");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar Sesión");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scan.nextInt();
            scan.nextLine();// Limpia el buffer osea las teclas que le damos clic

            switch (opcion) {
                case 1:
                    registrarUsuario();
                    break;
                case 2:
                    iniciarSesion();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    break;
            }
        } while (opcion != 3);

        scan.close();

    }

    public static void registrarUsuario() {
        System.out.print("Ingrese su nombre de usuario: ");
        String nombre = scan.next();
        System.out.print("Ingrese su apellido: ");
        String apellido = scan.next();
        System.out.print("Ingrese su contraseña: ");
        String contraseña = scan.next();

        // Verificar si el usuario ya existe
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getApellido().equals(apellido)) {
                System.out.println("El usuario ya existe");
                return;
            }
        }
        // Si no existe, lo agregamos
        usuarios.add(new Usuario(nombre, apellido, contraseña));
        System.out.println("---------------------------------");
        System.out.println("Usuario registrado exitosamente");
        System.out.println("---------------------------------");
    }

    public static void iniciarSesion() {
        System.out.print("Ingrese el nombre de usuario: ");
        String nombre = scan.next();
        System.out.print("Ingrese su apellido: ");
        String apellido = scan.next();
        System.out.print("Ingrese la contraseña: ");
        String contraseña = scan.next();

        boolean encontrado = false;
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getApellido().equals(apellido)
                    && usuario.getContraseña().equals(contraseña)) {
                System.out.println("---------------------------------");
                System.out.println("Inicio de sesión exitoso");
                System.out.println("---------------------------------");
                menuUsuario(usuario);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("---------------------------------");
            System.out.println("No está registrado o el nombre o la contraseña es incorrecta");
            System.out.println("---------------------------------");
        }
    }

    public static void mostrarInformacion(Usuario usuario) {
        System.out.println("=====INFORMACION DE LA CUENTA=========");
        System.out.println("El nombre del usuario es: " + usuario.getNombre());
        System.out.println("El apellido del usuario es: " + usuario.getApellido());
    }

    public static void menuUsuario(Usuario usuario) {
        int opcion;
        do {
            System.out.println("\n===== MENÚ DE USUARIO =====");
            System.out.println("Hola👋" + usuario.getNombre());
            System.out.println("1. Informacion del usuario");
            System.out.println("2. Registrar libros");
            System.out.println("3. Mostrar libros disponibles");
            System.out.println("4. Prestar libros");
            System.out.println("5. Devolver libros");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion) {
                case 1:
                    mostrarInformacion(usuario);
                    break;
                case 2:
                    System.out.print("Ingrese el titulo: ");
                    String titulo = scan.nextLine();
                    System.out.print("Ingrese el codigo: ");
                    String codigo = scan.nextLine();
                    System.out.print("Ingrese el Autor: ");
                    String autor = scan.nextLine();
                    biblioteca.registrarLibro(titulo, codigo, autor);
                    break;
                case 3:
                    biblioteca.mostrarLibrosDisponibles();
                    break;
                case 4:
                    System.out.println("Codigo del libro");
                    String codigoLibro = scan.next();
                    biblioteca.prestarLibros(usuario, codigoLibro);
                    break;
                case 5:
                    System.out.println("Codigo del libro:");
                    String codigoDevolver = scan.next();
                    biblioteca.devolverLibro(usuario, codigoDevolver);
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                default:
                    break;
            }
        } while (opcion != 6);
    }

}
