package biblioteca;

import usuarios.Usuario;
import libros.*;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<String> historial;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.historial = new ArrayList<>();
    }

    public void registrarLibro(String titulo, String codigo, String autor) {
        libros.add(new Libro(titulo, autor, codigo));
        System.out.println("-----------------------------");
        System.out.println("Libro Registrado correctamente");
        System.out.println("-----------------------------");
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("=== Libros Disponibles ===");
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                System.out.println("-----------------------");
                libro.mostrarDatos();
                System.out.println("-----------------------");
            }
        }
    }

    public void prestarLibros(Usuario usuario, String codigoLibro) {
        Libro libroEncontrado = null;

        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigoLibro)) {
                libroEncontrado = libro;
                break;
            }
        }
        if (libroEncontrado == null) {
            System.out.println("El libro con codigo " + codigoLibro + "no encontrado");
            return;
        }
        if (!libroEncontrado.isDisponible()) {
            System.out.println("El libro " + libroEncontrado.getTitulo() + "no esta dsiponible");
            return;
        }
        if (usuario.agregarPrestamo(libroEncontrado)) {
            libroEncontrado.marcarPrestado();

            String registro = "Prestamo: " + usuario.getNombre() + "" + usuario.getApellido() + ""
                    + libroEncontrado.getTitulo() + "";
            historial.add(registro);

            System.out.println("✅ Préstamo realizado exitosamente!");
            System.out.println("Libro: " + libroEncontrado.getTitulo());
            System.out.println("Usuario: " + usuario.getNombre() + " " + usuario.getApellido());
            System.out.println("-----------------------------");
        }
    }

    public void devolverLibro(Usuario usuario, String codigoLibro) {
        Libro libroEncontrado = null;

        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigoLibro)) {
                libroEncontrado = libro;
                break;
            }
        }
        if (libroEncontrado == null) {
            System.out.println("El libro con codigo: " + codigoLibro + "no has sido encontrado");
        }

        boolean usuarioTieneLibro = false;

        for (Libro libroPrestado : usuario.getLibrosPrestados()) {
            if (libroPrestado.getCodigo().equals(codigoLibro)) {
                usuarioTieneLibro = true;
                break;
            }
        }
        if (!usuarioTieneLibro) {
            System.out.println("El usuario no tiene libro ");
            return;
        }
        usuario.devolverLibro(libroEncontrado);
        libroEncontrado.marcarDisponible();

        String registro = "Nombre: " + usuario.getNombre() + "Apellido: " + usuario.getApellido() + "devolvio"
                + libroEncontrado.getTitulo();
        historial.add(registro);

        System.out.println("Libro devuelto exitosamente!");
        System.out.println("Libro: " + libroEncontrado.getTitulo());
        System.out.println("Usuario: " + usuario.getNombre() + " " + usuario.getApellido());
        System.out.println("-----------------------------");
    }

}
