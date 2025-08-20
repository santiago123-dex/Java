package libros;
public class Libro {
    String titulo;
    String autor;
    String codigo;
    Boolean disponible;

    public Libro (String titulo, String autor, String codigo){
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.disponible = true;
    }

    public void mostrarDatos(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Codigo: " + codigo);
        System.out.println("Disponible: " + disponible);
    }

    public void marcarPrestado(){
        this.disponible = false;
    }

    public void marcarDisponible(){
        this.disponible = true;
    }

    public String getTitulo(){
        return titulo;
    }

     public String getCodigo(){
        return codigo;
    }

    public boolean isDisponible(){
        return disponible;
    }
}
