
public class Inventor {
    String nombre;
    String edad;
    int nivelCreatividad;

    public Inventor(String nombre, String edad, int nivelCreatividad){
        this.nombre = nombre;
        this.edad = edad;
      
        this.nivelCreatividad = nivelCreatividad;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("Nivel de creatividad: " + nivelCreatividad);
    }
    

    public String getNombre(){
        return nombre;
    }

    public String getEdad(){
        return edad;
    }

    public int getNivelCreatividad(){
        return nivelCreatividad;
    }



    public int agregarPuntaje(int puntos){
        return nivelCreatividad += puntos;
    }
}
