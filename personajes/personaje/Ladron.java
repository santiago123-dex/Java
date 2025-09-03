package personaje;

public class Ladron extends Personaje {

    public Ladron(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void actuar() {
        System.out.println(getNombre() + " se esconde en las sombras y roba sigilosamente.");
    }
}
