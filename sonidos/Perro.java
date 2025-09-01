
public class Perro extends Animales {
    private String sonido;

    public Perro(String sonido){
        this.sonido = sonido;
    }

    @Override
    public String hacerSonido(){
        return sonido;
    }
}

