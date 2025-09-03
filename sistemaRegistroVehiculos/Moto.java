public class Moto extends Transporte {
    public Moto(String marca, String modelo, int velocidadMaxima){
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void arrancar(){
        System.out.println("La moto esta arrancando");
    }

    @Override
    public void detener(){
        System.out.println("La moto se ha detenido");
    }

    @Override
    public void tipoCombustible(){
        System.out.println("La moto usa gasolina");
    }
}
