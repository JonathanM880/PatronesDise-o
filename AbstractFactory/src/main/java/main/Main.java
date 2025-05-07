package main;

import inter.Boton;
import inter.UIFactory;
import inter.Ventana;
import impl.Aplicacion;
import com.*;
import com.claro.UIFactoryClaro;
import com.oscuro.UIFactoryOscuro;
public class Main {
	public static void main(String[] args) {
		Aplicacion app = null;
		String tema= "oscuro";
		
		if(tema.equals("claro")) {
			UIFactory f = new UIFactoryClaro();
			app = new Aplicacion(f);
		}
		if(tema.equals("oscuro")) {
			UIFactory f = new UIFactoryOscuro();
			app = new Aplicacion(f);
		}
		
		app.ejecutar();
	}
}
