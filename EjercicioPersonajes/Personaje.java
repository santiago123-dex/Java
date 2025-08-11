package EjercicioPersonajes;


public class Personaje {
    String nombre;
    String poder;
    Boolean arma;
    Boolean bueno;
    Integer vida;
    Integer ataque;
    Integer curar;

    public Personaje(String nombre, String poder, Boolean arma, Boolean bueno, Integer vida, Integer ataque, Integer curar) {
        this.nombre = nombre;
        this.poder = poder;
        this.arma = arma;
        this.bueno = bueno;
        this.vida = vida;
        this.ataque = ataque;
        this.curar = curar;
    }

    public void mostrarPersonaje() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("El poder es: " + poder);
        System.out.println("El arma es: " + arma);
        System.out.println("El bueno es: " + bueno);
        System.out.println("El vida es: " + vida);
        System.out.println("El ataque es: " + ataque);
    }

    public void batalla(Personaje objetivo) {
        objetivo.vida -= ataque;
        System.out.println(nombre + "Atacó a " + objetivo.nombre + " y le quito " + ataque + " puntos de vida");
    }

    public void curar (Personaje objetivo){
        objetivo.vida += curar;
        System.out.println(nombre + " Curo a " + objetivo.nombre + " y le agrego " + curar + " puntos de vida");
    }

    public static void main(String[] args) {
        Personaje ironman = new Personaje("Ironman", "Volar", true, true, 100, 90, null);
        Personaje spiderman = new Personaje("Spiderman", "aracnido", true, true, 100, 80, null);
        Personaje doctorStrange = new Personaje("Doctor Strange", "Cura", true, true , 100, 50, 50);

        ironman.mostrarPersonaje();
        System.out.println();
        spiderman.mostrarPersonaje();
        ironman.batalla(spiderman);
        System.out.println();
        spiderman.mostrarPersonaje();
        System.out.println();
        doctorStrange.curar(spiderman);
        System.out.println();
        spiderman.mostrarPersonaje();

    }

}
