package trabajopractico2tateti;

public class ControladorDelJuego {
    private LogicaDelJuego juego;
    
    public ControladorDelJuego(){
        juego = new LogicaDelJuego();
    }
    
    public void iniciarAplicacion(){
        while(true){
            int opcion = EntradaSalida.leerOpcionDelMenu(" 1 - Jugar 2P\n 2 - Jugar VS PC\n 3 - Salir");
            switch(opcion){
                case 1:
                    iniciarJuegoDe2Jugadores();
                    break;
                case 2:
                    iniciarJuegoContraLaComputadora();
                    break;
                case 3:
                    salir();
                    break;             
            }
        }
    }
    
    public void iniciarJuegoDe2Jugadores(){
        this.juego.iniciarJuego(2);
    }
    
    public void iniciarJuegoContraLaComputadora(){
        this.juego.iniciarJuego(1);
    }
    
    public void salir(){
        System.exit(0);
    }
}
