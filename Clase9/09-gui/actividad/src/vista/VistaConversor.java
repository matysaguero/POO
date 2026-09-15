package vista;
import modelo.Conversor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VistaConversor {
    private final JFrame interfaz;
    private final JTextField campoPesos;
    private final JLabel etiquetaResultado;
    private final JButton botonConvertir;

    public VistaConversor(){
        //super("Conversor de moneda");
        JFrame interfaz = new JFrame("interfaz"); 
        this.interfaz.setSize(360, 200);
        this.interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.interfaz.setLocationRelativeTo(null);
        this.interfaz.setResizable(false);
        // Sin administrador de disposicion: cada componente se ubica con setBounds().
        this.interfaz.setLayout(null);
    
    
        JLabel etiquetaResultado = new JLabel("Resultado:  ");
        this.campoPesos = new JTextField();
        this.botonConvertir = new JButton("Convertir:  ");
        
        etiquetaResultado.setBounds(20, 20, 120, 25);
        this.campoPesos.setBounds(150, 20, 170, 25);
        this.botonConvertir.setBounds(90, 65, 210, 50);

        this.interfaz.add(etiquetaResultado);
        this.interfaz.add(this.campoPesos);
        this.interfaz.add(this.botonConvertir);
    }


    public void mostrar(){
        this.interfaz.setVisible(true);
    }

    public JButton getBotonConvertir(){
       return this.botonConvertir;
    }

    public JTextField getTextoPesos(){
        return this.campoPesos;
    }

    public void mostrarResultado(double total){
        this.etiquetaResultado.setText(String.format("Total en dolares: $%.2f", total));
    }

    public void mostrarError(String mensaje){
        JOptionPane.showMessageDialog(this.interfaz, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

}
