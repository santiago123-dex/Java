import java.util.Scanner;

public class Gato implements Sonido {


    @Override
    public String hacerSonido2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Como hace el gato? : ");
        String respuesta = scanner.nextLine();
        scanner.close();
        return respuesta;

    }
}

