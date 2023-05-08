package ar.edu.unalm.pb2;

public class Motocicleta extends Vehiculo {
	private Persona acompañante;

	public Motocicleta(Persona chofer, Integer km) {
		super(chofer, km);
	}

	public void subirAcompañante(Persona acompañante) {
		this.acompañante = acompañante;
		
	}

	@Override
	Boolean cambiarChofer(Persona chofer) {
		if(this.acompañante == null) {
			this.chofer = chofer;
			return true;
		} return false;
		
	}

	public Persona getAcompañante() {
		return acompañante;
	}

	
	

}
