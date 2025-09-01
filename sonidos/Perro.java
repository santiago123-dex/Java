import java.util.Scanner;

public class Perro implements Sonido {

    @Override
    public String hacerSonido2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Como hace el Perro ?: ");
        String respuesta1 = scanner.nextLine();
        scanner.close();
        return respuesta1;
    }
}
