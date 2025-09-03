package personaje;

public class Mago extends Personaje{
    public Mago(String nombre, int nivel){
        super(nombre,nivel);
    }

    @Override
    public void actuar(){
        System.out.println(getNombre() + " Lanza un hechizo de fuego con su sabiduria");
    }
 }
