package ar.edu.unalm.pb2;

import java.util.ArrayList;

public class Automovil extends Vehiculo {
	private ArrayList<Persona> pasajeros = new ArrayList<Persona>();

	public Automovil(Persona chofer, Integer km) {
		super(chofer, km);
	}

	@Override
	Boolean cambiarChofer(Persona chofer) {
		this.chofer = chofer;
		return true;
	}

	public boolean subirPasajero(Persona pasajero) {
		if(this.pasajeros.size()<3) {
			return pasajeros.add(pasajero);
		} return false;
		
	}

}
