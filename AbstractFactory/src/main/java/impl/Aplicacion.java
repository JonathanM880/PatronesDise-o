package impl;

import inter.Boton;
import inter.UIFactory;
import inter.Ventana;

public class Aplicacion {

	private Ventana v;
	private Boton b;
	
	public Aplicacion(UIFactory factory) {
		this.v = factory.crearVentana();
		this.b = factory.crearBoton();
	}
	
	public void ejecutar() {
		v.abrirVentana();
		b.pulsarBoton();
	}
	
	
	
	
}
