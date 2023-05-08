package ar.edu.unalm.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_transporte {

	@Test
	public void queSePuedaAsignarUnChoferYKilometrosRecorridosAUnVehiculoCualquiera() {
		// como la clase vehiculo es abstracta, hago la prueba con una clase hija.

		Persona chofer = new Persona("Hugo");
		Motocicleta moto = new Motocicleta(chofer, 300);

		String choferDeseado = "Hugo";
		String choferObtenido = moto.getChofer().nombre;
		Integer kmDeseado = 300;
		Integer kmObtenido = moto.getKm();

		assertEquals(choferDeseado, choferObtenido);
		assertEquals(kmDeseado, kmObtenido);

	}

	@Test
	public void queSePuedaCambiarUnChoferAUnaMotocicleta() {
		Persona chofer = new Persona("Hugo");
		Persona chofer2 = new Persona("Marcos");
		Motocicleta moto = new Motocicleta(chofer, 300);
		
		assertTrue(moto.cambiarChofer(chofer2));

	}

	@Test
	public void queSePuedaAsignarUnAcompañanteAUnaMotocicleta() {
		Persona chofer = new Persona("Hugo");
		Motocicleta moto = new Motocicleta(chofer, 300);
		Persona acompañante = new Persona("Mariana");
		moto.subirAcompañante(acompañante);

		String deseada = "Mariana";
		String obtenida = moto.getAcompañante().nombre;

		assertEquals(deseada, obtenida);

	}

	@Test
	public void queNoSePuedaCambiarUnChoferAUnaMotocicletaQueTengaUnAcompañante() {
		Persona chofer = new Persona("Hugo");
		Persona chofer2 = new Persona("Carlos");
		Persona acompañante = new Persona("Lucia");
		Motocicleta moto = new Motocicleta(chofer, 300);
		moto.subirAcompañante(acompañante);

		assertFalse(moto.cambiarChofer(chofer2));
	}

	@Test
	public void queSePuedaCambiarUnChoferAUnAutobus() {
		Persona chofer = new Persona("Hugo");
		Persona chofer2 = new Persona("Marcos");
		Autobus bus = new Autobus(chofer, 600);

		assertTrue(bus.cambiarChofer(chofer2));

	}

	@Test
	public void queSePuedaSubirUnPasajeroAUnAutobus() {
		Persona chofer = new Persona("Hugo");
		Autobus bus = new Autobus(chofer, 600);
		Persona pasajero = new Persona("Maria");

		bus.agregarPasajeros(pasajero);

		Integer deseado = 1;
		Integer obtenido = bus.obtenerCantidadDePasajeros();
		
		assertEquals(deseado, obtenido);

	}

	@Test
	public void queNoSePuedaCambiarUnChoferAUnAutobusQueTienePasajeros() {
		Persona chofer = new Persona("Hugo");
		Persona chofer2 = new Persona("Marcos");
		Autobus bus = new Autobus(chofer, 600);
		Persona pasajero = new Persona("Maria");
		bus.agregarPasajeros(pasajero);
		
		assertFalse(bus.cambiarChofer(chofer2));

	}

	@Test
	public void queNoSePuedanSubirMasDeVeintePasajeros() {
		Persona chofer = new Persona("Hugo");
		Autobus bus = new Autobus(chofer, 600);

		for (int i = 0; i < 21; i++) {
			bus.agregarPasajeros(new Persona("pasajero"));
		}

		Integer deseado = 20;
		Integer obtenido = bus.obtenerCantidadDePasajeros();
		
		assertEquals(deseado, obtenido);

	}

	@Test
	public void queSePuedaCambiarUnChoferAUnAutomovil() {
		Persona chofer = new Persona("Hugo");
		Persona chofer2 = new Persona("Marcos");
		Automovil auto = new Automovil(chofer, 600);
		
		assertTrue(auto.cambiarChofer(chofer2));

	}

	@Test
	public void queSePuedaSubirUnPasajeroAUnAutomovil() {
		Persona chofer = new Persona("Hugo");
		Automovil auto = new Automovil(chofer, 600);
		Persona pasajero = new Persona("Maria");

		assertTrue(auto.subirPasajero(pasajero));

	}

	@Test
	public void queNoSePuedanSubirMasDeTresPasajerosAUnAutomovil() {
		Persona chofer = new Persona("Hugo");
		Automovil auto = new Automovil(chofer, 600);
		Persona p1 = new Persona("Maria");
		Persona p2 = new Persona("Maria");
		Persona p3 = new Persona("Maria");
		Persona p4 = new Persona("Maria");

		assertTrue(auto.subirPasajero(p1));
		assertTrue(auto.subirPasajero(p2));
		assertTrue(auto.subirPasajero(p3));
		assertFalse(auto.subirPasajero(p4));

	}

}
