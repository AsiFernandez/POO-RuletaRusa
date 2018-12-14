
public class Revolver {

	/*
	 * ATRIBUTOS
	 */
	private int posicionTambor; //numero que se genera automaticamente muestra en que posicion esta el tambor del revolver
	private int posicionBala;	//numero que se genera automaticamente
	
	/*
	 * METO2
	 */
	
	//metodo que devuelve true si la bala coincide con la posicion actual de la bala
	private boolean disparar(int posicionTambor, int posicionBala) {
		
		boolean disparo = true;
		
		if(posicionTambor != posicionBala) {
			 disparo = false;
		}else {
			disparo = true;
		}
			
		return disparo;
	}
	
	//metodo que cambia la posicion del tambor del revolver
	private static void siguienteBala(int posicionTambor) {
		posicionTambor = posicionTambor++;
	}
	
	
	public String toString() {
		return "Posicion del tambor: " + posicionTambor + "Posicion de la bala: " + posicionBala;
	}
	
}
