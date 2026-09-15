import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Heroe heroe ;
        if (new Random().nextInt(10) > 5) {
            heroe =new Heroe();
            new Escenario(heroe);
        }
        else {
            heroe = null;
        }

        heroe = (new Random().nextInt(10) > 5) ? new Heroe() : null; 

        Escenario escenario = new Escenario();
        Escenario escenario2 = new Escenario(heroe);

        ArrayList<Enemigo> enemigos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Enemigo enemigo = new Enemigo();
            enemigos.add(enemigo);
        }

        for (int i = 0; i < enemigos.size(); i++) {
            Enemigo enemigo = enemigos.get(i);
            System.out.println(enemigo);
        }

        for (Enemigo enemigo : enemigos) {
            System.out.println(enemigo);
        }

        Escenario escenario3 = new Escenario(heroe, enemigos);
    }
}
