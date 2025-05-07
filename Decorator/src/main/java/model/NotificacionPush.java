package model;

import anotaciones.MiAnotacion;
import inter.Notificacion;
@MiAnotacion(name ="push")
public class NotificacionPush extends NotificacionDecorator{

	public NotificacionPush(Notificacion noti) {
		super(noti);
		// TODO Auto-generated constructor stub
	}
	
	public void enviarPush(String msg) {
		System.out.println("Se envia mensaje por clase NotificacionPush "+msg);
	}
	
	@Override
	public void enviar(String msg) {
		// TODO Auto-generated method stub
		super.enviar(msg);
		enviarPush(msg);
	}

}
