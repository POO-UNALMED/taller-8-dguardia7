package futbol;
public class Portero extends Futbolista {

	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return true;
	}
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + 
				", y juega de "+this.getPosicion()+ " con el dorsal " + this.dorsal + 
				". Le han marcado " + this.golesRecibidos;
	}
	public int compareTo(Object p) {
		int res;
		short e1 = this.golesRecibidos;
		short e2 = ((Portero)p).golesRecibidos;
		if(e2 >= e1) {
			res = e2 - e1;
		} else {
			res = e1 - e2;
		}
		return res;
	}

}
