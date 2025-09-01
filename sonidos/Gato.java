

public class Gato extends Animales {
    private String sonido;

    public Gato(String sonido){
        this.sonido = sonido;
    }

    @Override
    public String hacerSonido(){
        return sonido;
    }
}

