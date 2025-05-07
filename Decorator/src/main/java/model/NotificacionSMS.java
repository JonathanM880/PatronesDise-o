package model;

import anotaciones.MiAnotacion;
import inter.Notificacion;

@MiAnotacion(name ="sms")
public class NotificacionSMS extends NotificacionDecorator {

	public NotificacionSMS(Notificacion noti) {
		super(noti);
		// TODO Auto-generated constructor stub
	}

	public void enviarSMS(String msg) {
		System.out.println("Se envia mensaje de clase NotificacionSMS "+msg);
		
	}
	
	@Override
	public void enviar(String msg) {
		// TODO Auto-generated method stub
		super.enviar(msg);
		enviarSMS(msg);
	}
	
}
