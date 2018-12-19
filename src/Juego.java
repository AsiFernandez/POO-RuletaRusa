
public class Juego {

	private Jugador[] jugadores;
	private Revolver revolver;
	
	/*
	 * GETTERS Y SETTERS
	 */
	
	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	public Revolver getRevolver() {
		return revolver;
	}

	public void setRevolver(Revolver revolver) {
		this.revolver = revolver;
	}
	
	
	/*
	 * METODOS
	 */
	
	//metodo para crear la partida con la cantidad de jugadores que tiene
	public Juego (int numJugadores) {
		jugadores = new Jugador[comprobarJugadores(numJugadores)];
	}
	
	
	  //metodo para comprobar que los jugadores son
	  //entre 1 y 6, en caso de no estar en ese rango
	  //se predefinira como 6 
	 
	private int comprobarJugadores(int numJugadores) {
		
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
		boolean fin = false;
		for(int i= 0; i< jugadores.length; i++) {
			if(!jugadores[i].isVivo()) {
				fin = true;
			}
		}
			return fin;
	}
	
	
}
