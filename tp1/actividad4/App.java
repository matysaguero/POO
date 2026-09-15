import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = scanner.nextInt();
        imprimir(suma(num1, num2));
    }

public static int suma(int x, int a) {
return x + a;
}
    
public static void imprimir(int c) {
    System.out.println("La suma de los numeros es: "+ c);
}
}
