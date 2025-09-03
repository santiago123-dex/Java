
public class Carro extends Transporte {
    public Carro(String marca, String modelo, int velocidadMaxima){
            super(marca, modelo, velocidadMaxima);
        }

    @Override
    public void arrancar() {
        System.out.println("El carro esta arrancando");
    }

    @Override
    public void detener() {
        System.out.println("El carro se ha deteniendo");
    }

    @Override
    public void tipoCombustible(){
        System.out.println("El carro usa gasolina");
    }
}
