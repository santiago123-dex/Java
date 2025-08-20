package usuarios;

import libros.Libro;
import java.util.ArrayList;

public class Usuario {
    String nombre;
    String apellido;
    private String contraseña;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, String apellido, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public ArrayList<Libro> getLibrosPrestados(){
        return librosPrestados;
    }

    public void mostrarDatos(){
        System.out.println("Usuario " + nombre + " " + apellido);
        System.out.println("Libros prestados:");
        for(Libro libro : librosPrestados){
            System.out.println("- " + libro.getTitulo());
        }    
        
    }

    public boolean agregarPrestamo(Libro libro){
        if (librosPrestados.size() >= 3) {
            System.out.println("No puedes prestar mas de 3 libros");
            return false;
        }
        librosPrestados.add(libro);
            return true;
    }

    public void devolverLibro(Libro libro){
        librosPrestados.remove(libro);
    }

}
