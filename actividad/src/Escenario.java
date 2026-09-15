import java.util.ArrayList;

public class Escenario
{
    private Heroe heroe;
    private ArrayList<Enemigo> enemigos;

    // POLIMORFISMO:

    public Escenario()
    {
    }    

    public Escenario(Heroe heroe)
    {
        this.heroe = heroe;
    }

    public Escenario(Heroe heroe, ArrayList<Enemigo> enemigos)
    {
        this.heroe = heroe;
        this.enemigos = enemigos;
    }
}