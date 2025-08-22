public class Moto extends Vehiculo {

    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        velocidad += 15;
        System.out.println(marca + " (moto) acelera a " + velocidad + " km/h 🏍️");
    }

    @Override
    public void frenar() {
        velocidad -= 7;
        if (velocidad < 0) velocidad = 0;
        System.out.println(marca + " (moto) frena a " + velocidad + " km/h 🏍️🛑");
    }
}
