package ar.edu.unalm.pb2;

public abstract class Vehiculo {
	protected Persona chofer;
	protected Integer km;
	
	public Vehiculo(Persona chofer, Integer km) {
		this.chofer = chofer;
		this.km = km;
	}
	
	abstract Boolean cambiarChofer(Persona chofer);

	protected Persona getChofer() {
		return chofer;
	}

	protected Integer getKm() {
		return km;
	}

	
	

}
