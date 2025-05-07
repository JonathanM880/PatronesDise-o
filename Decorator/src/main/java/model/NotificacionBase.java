package model;

import anotaciones.MiAnotacion;
import inter.Notificacion;

@MiAnotacion(name ="base")
public class NotificacionBase implements Notificacion{

	@Override
	public void enviar(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Mensaje enviado desde la clase NotificacionBase "+ msg);
	}

}
