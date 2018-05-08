package trabajopractico2tateti;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EntradaSalida {
    public static int leerDatoEntero(String mensaje)
    {
        int numEntero = 0;
        try{
            numEntero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        }
        catch(Exception e){
            EntradaSalida.mostrarMensajeDeError("Error de lectura del Entero");
        }
        return numEntero;
    }

    public static void mostrarCadena(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static String leerCadena(String mensaje){
        return (JOptionPane.showInputDialog(mensaje));
    }
    
    public static void mostrarMensajeDeError(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    public static int leerOpcionDelMenu(String mensaje){
        int numEntero = 0;
        final ImageIcon icon = new ImageIcon("src/trabajopractico2tateti/tateti.png");     
        try{     
            numEntero = Integer.parseInt((String) JOptionPane.showInputDialog(null,mensaje,"TA-TE-TI",JOptionPane.INFORMATION_MESSAGE,icon,null,"Ingrese opcion"));
        }
        catch(Exception e){
            EntradaSalida.mostrarMensajeDeError("Error de lectura del Entero");
        }
        return numEntero;
    }
    
}
