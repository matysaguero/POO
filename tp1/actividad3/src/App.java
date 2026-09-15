import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, usuario! ¿Cuál es tu nombre?");
        
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        
        System.out.println("hola "+nombre);
    }
}

