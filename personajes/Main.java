
import personaje.*;

public class Main {
    public static void main(String[] args) {
        Personaje g = new Guerrero("Javiz", 5);
        Personaje m = new Mago("Fajis", 10);
        Personaje l = new Ladron("Eusebio", 3);

        g.actuar();
        m.actuar();
        l.actuar();

        System.out.println(m.getNombre() + " está en nivel " + m.getNivel());
        m.setNivel(11); 
        System.out.println("Ahora " + m.getNombre() + " subió a nivel " + m.getNivel());
    }
}
