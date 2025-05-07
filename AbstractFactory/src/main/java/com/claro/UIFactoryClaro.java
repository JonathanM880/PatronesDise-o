package com.claro;

import inter.Boton;
import inter.UIFactory;
import inter.Ventana;

public class UIFactoryClaro implements UIFactory {

	@Override
	public Ventana crearVentana() {
		// TODO Auto-generated method stub
		return  new VentanaClara();
	}

	@Override
	public Boton crearBoton() {
		// TODO Auto-generated method stub
		return new BotonClaro();
	}

}
