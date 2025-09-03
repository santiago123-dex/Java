public class Bicicleta extends Transporte{
    public Bicicleta(String marca, String modelo, int velocidadMaxima){
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void arrancar(){
        System.out.println("La bicicleta ha comenzado a moverse");
    }

    @Override
    public void detener(){
        System.out.println("La bicicleta se ha detenido");
    }

    @Override
    public void tipoCombustible(){
        System.out.println("La bicileta no usa combustible");
    }
}
