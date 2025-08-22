public class Vehiculo {
    String marca;
    int velocidad;

    public Vehiculo(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    public void acelerar() {
        velocidad += 5;
        System.out.println(marca + " acelera a " + velocidad + " km/h");
    }

    public void frenar() {
        velocidad -= 5;
        if (velocidad < 0) velocidad = 0;
        System.out.println(marca + " frena a " + velocidad + " km/h");
    }
}
