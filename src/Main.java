import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            // creamos el objeto ventana con la clase JFRAME y su título

            JFrame ventana = new JFrame("Ventana");

            //Revisar este metodo
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //Hay que usar el metedo general de JavaX crear un nuevo objeto importando la clase ImageIcon
            // y entre "" añadir la ruta del archivo.
            ventana.setIconImage(new ImageIcon("C:/Users/Pablo/Desktop/Imagenes/server-icon.jpg").getImage());

            //Las dimensiones de la ventana inicial
            ventana.setSize(600, 600);

            //Un objeto de la clase JLabel con un mensaje de texto centrado en pantalla
            JLabel mensaje = new JLabel("Sape!", JLabel.CENTER);

            //utiliza el objeto JFrame y utilizando el metodo add de la clase, invocamos alobjeto mensaje con el texto a mostrar.
            ventana.add(mensaje);

            // muestra o esconde el objeto de ventana según true o false.
            ventana.setVisible(true);
        });
    }
}