package probar;

import fac.NotificacionLoader;
import inter.Notificacion;
import model.NotificacionBase;
import model.NotificacionDecorator;
import model.NotificacionPush;
import model.NotificacionSMS;

public class Main {

	public static void main(String[] args) {
		
		//FORMA 1
		Notificacion a = new NotificacionPush(new NotificacionSMS(new NotificacionBase()));
		
		a.enviar("hola mundo");
		
		
		//FORMA 2
		NotificacionLoader l = new NotificacionLoader();
		l.init("model");
		Notificacion b = l.create("push", l.create("sms", l.create("base", null)));
		b.enviar("gua");
	}
}
