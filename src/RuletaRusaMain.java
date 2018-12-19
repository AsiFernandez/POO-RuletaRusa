
public class RuletaRusaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Juego j = new Juego(2);
		
		while(!j.finJuego()) {
			j.ronda();
		}
		
		
		
	}

}
