package personaje;

public abstract class Personaje {
    protected String nombre;
    protected int nivel;

    public Personaje(String nombre, int nivel){
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getNombre(){
        return nombre;
    }

    public int getNivel(){
        return nivel;
    }

    //settear el nivel del personaje 
    public void setNivel(int nivel){
        if(nivel > 0){
            this.nivel = nivel;
        }
    }


    //para que cada hijo pueda utilizarla con la accion requerida
     public abstract void actuar();
}
