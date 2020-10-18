package futbol;
public class Jugador extends Futbolista {
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	public Jugador(String nombre, int edad, String p, short golesMarcados, byte dorsal) {
		super(nombre, edad, p);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	public int compareTo(Object f) {
		int res;
		int e1 = this.getEdad();
		int e2 = ((Futbolista) f).getEdad();
		if(e2 >= e1) {
			res = e2 - e1;
		} else {
			res = e1 - e2;
		}
		return res;
	}
	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + 
				", y juega de " + this.getPosicion() + 
				" con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
	}

}
