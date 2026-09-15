import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la primer frase: ");
        String frase1 = scanner.nextLine();

        System.out.println("Ingrese la segunda frase");
        String frase2 = scanner.nextLine();
    
    
        System.out.println("El resultado de las frases ingresadas son: "+ frase1 + " y" + frase2);
    }

        
}
