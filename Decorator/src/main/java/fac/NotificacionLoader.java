package fac;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.common.reflect.ClassPath;

import anotaciones.MiAnotacion;
import inter.Notificacion;

public class NotificacionLoader implements Factory {

	Map<String, Class<? extends Notificacion>> componentes = new HashMap<String, Class<? extends Notificacion>>();

	@Override
	public void init(String pkname) {
		// TODO Auto-generated method stub
		try {
			ClassPath classpath = ClassPath.from(NotificacionLoader.class.getClassLoader());
			var clases = classpath.getTopLevelClassesRecursive(pkname);

			for (var it : clases) {

				var miComp = it.load().getAnnotation(MiAnotacion.class);

				if (miComp != null) {

					componentes.put(miComp.name(), (Class<? extends Notificacion>) it.load());
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public <T> T create(String tema, Notificacion not) {
		// TODO Auto-generated method stub
		Class<? extends Notificacion> factoryClass = componentes.get(tema);

		if (factoryClass == null) {
			throw new RuntimeException("No se ha encontrado la fabrica " + componentes.get(tema) + " pipipipipi ");
		}

		try {
			if (not == null) {
				return (T) factoryClass.getDeclaredConstructor().newInstance();
			}
			return (T) factoryClass.getDeclaredConstructor(Notificacion.class).newInstance(not);
		} catch (Exception e) {
			throw new RuntimeException("F mi gente ");
		}
	}
}
