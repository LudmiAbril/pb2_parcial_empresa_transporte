package ar.edu.unalm.pb2;

import java.util.ArrayList;

public class Autobus extends Vehiculo {
	private ArrayList<Persona> pasajeros = new ArrayList<Persona>();

	public Autobus(Persona chofer, Integer km) {
		super(chofer, km);
	}

	@Override
	Boolean cambiarChofer(Persona chofer) {
		if (pasajeros.size() < 1) {
			this.chofer = chofer;
			return true;
		}
		return false;

	}

	public void agregarPasajeros(Persona pasajero) {
		if (pasajeros.size() < 20) {
			pasajeros.add(pasajero);
		}

	}

	public Integer obtenerCantidadDePasajeros() {
		return pasajeros.size();
	}

}
