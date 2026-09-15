public class App {
    
    public static void main(String[] args) throws Exception {
        String saludos = "Hola";
        int long_salud = saludos.length();
        
        for (int i = 1; i <= 5; i++) {
        System.out.println(saludos);
        }
    
    
        imprime(depende(long_salud));
    }

    public static void imprime(int x){
        System.out.println(x);
        
    }

    public static int depende(int long_) {
        if (long_ <= 4) {
            String corto = "Saludo muy corto";
            int long_corto = corto.length();
            System.out.println(corto);
            return long_corto;
        } else {
            String largo = "Saludo de buen largo 7w7";
            int long_larga = largo.length();
            System.out.println(largo);
            return long_larga;
        }
    }
}