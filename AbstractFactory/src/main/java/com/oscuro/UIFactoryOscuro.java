package com.oscuro;

import inter.Boton;
import inter.UIFactory;
import inter.Ventana;

public class UIFactoryOscuro implements UIFactory{

	@Override
	public Ventana crearVentana() {
		// TODO Auto-generated method stub
		return new VentanaOscura();
	}

	@Override
	public Boton crearBoton() {
		// TODO Auto-generated method stub
		return new BotonOscuro();
	}

}
