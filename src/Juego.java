
public class Juego {

	private Jugador[] jugadores;
	private Revolver revolver;
	
	// Constructor
	public Juego (int numJugadores) {
		jugadores = new Jugador[comprobarJugadores(numJugadores)];
		crearJugadores();
		revolver = new Revolver();
	}
	
	public int comprobarJugadores(int numJugadores) {
		if(!(numJugadores >= 1 && numJugadores <= 6)) {
            numJugadores = 6;
		}
		return numJugadores;
	}
	
	  //crea y rellena el array 
	  //con la cantidad de jugadores que se haya introducido
	 
	private void crearJugadores() {
		for(int i= 0; i < jugadores.length; i++) {
			jugadores[i] = new Jugador(i + 1);
		}
	}
	
	
	/*
	 * FUNCIONES
	 */
	
	//Funcion de cada ronda, 
	//una vez el jugador esta muerto 
	public void ronda() {
		for(int i= 0; i<jugadores.length; i++) {
			jugadores[i].disparar(revolver);
		}
	}
	
	
	public boolean finJuego() {
		
		for(int i= 0; i< jugadores.length; i++) {
			if(!jugadores[i].isVivo()) {
				return true;
				
			}
		}
			return false;
	}
	
	
	
}
