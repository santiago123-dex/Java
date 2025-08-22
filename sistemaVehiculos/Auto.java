public class Auto extends Vehiculo {

    public Auto(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        velocidad += 20;
        System.out.println(marca + " (auto) acelera a " + velocidad + " km/h 🚗");
    }

    @Override
    public void frenar() {
        velocidad -= 10;
        if (velocidad < 0) velocidad = 0;
        System.out.println(marca + " (auto) frena a " + velocidad + " km/h 🚗🛑");
    }
}
