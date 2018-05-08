package trabajopractico2tateti;
/*
Enunciado del Trabajo Práctico 2
Definir una clase llamada TaTeTi que le permita escribir un programa completo para
que dos jugadores puedan jugar al TaTeTi. La clase debe contener una matriz de enteros
de 3 filas y 3 columnas que representa el tablero. El constructor debe inicializar el
tablero vacío con ceros. Siempre que el primer jugador coloque una marca, se llenará
con 1 la casilla especificada y un 2 si juega el jugador 2. Se puede marcar solo aquellas
casillas que están vacías. Después de cada jugada hay que determinar si hay algún
jugador ganador o hay empate.
Incluir en el programa la opción de elegir que el juego se desarrolle entre dos
jugadores o un jugador con la computadora.
*/

public class TrabajoPractico2TaTeTi {

  
    public static void main(String[] args) {
       ControladorDelJuego controlador = new ControladorDelJuego();
       controlador.iniciarAplicacion();
    }
    
}
