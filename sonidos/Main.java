public class Main{
    public static void main(String[] args) {
        Sonido sonidoGato = new Gato();
        Sonido sonidoPerro = new Perro();

        System.out.println("El gato hace: " + sonidoGato.hacerSonido2());
        System.out.println("El perro hace: " + sonidoPerro.hacerSonido2());
    }
}