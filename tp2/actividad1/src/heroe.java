public class heroe {
    private String nombre;
    private int puntosVida;
    private int puntosMana;
    private int nivel;
    
    public heroe (String nombre, int puntosVida, int puntosMana, int nivel){
        this.nombre = nombre;
        this.puntosVida = 100;
        this.puntosMana = 50;
        this.nivel = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }
    
    public int getPuntosMana() {
        return puntosMana;
    }

    public int getNivel(){
        return nivel;
    }

    public void setNombre (String nombre){
        if (this.nombre.isEmpty()|| this.nombre == "") {
            return false;
        } else {
            return true;
        }
            
    }



}

