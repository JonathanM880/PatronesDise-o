package model;

import inter.Notificacion;

public class NotificacionDecorator implements Notificacion {

	protected Notificacion notificacion;

	public NotificacionDecorator(Notificacion noti) {
		super();
		this.notificacion = noti;
	}

	@Override
	public void enviar(String msg) {
		// TODO Auto-generated method stub
		notificacion.enviar(msg);
	}
	
	
}
