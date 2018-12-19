
public class RuletaRusaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Juego j = new Juego(6);
		
		while( !j.finJuego()) {
			j.ronda();
		}
		
		System.out.println("El jeugo ha terminado");
		
		
	}

}
