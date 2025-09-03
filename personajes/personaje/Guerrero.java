package personaje;

public class Guerrero extends Personaje {
    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void actuar(){
        System.out.println(getNombre() + " ataca con una espada que tiene gran fuerza");
    }
}
