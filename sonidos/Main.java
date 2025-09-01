public class Main{
    public static void main(String[] args) {
        Animales gato = new Gato("Miau");
        Animales perro = new Perro("Guau");

        System.out.println("El gato hace: " + gato.hacerSonido());
        System.out.println("El perro hace: " + perro.hacerSonido());
    }
}