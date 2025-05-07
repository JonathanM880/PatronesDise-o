package fac;

import inter.Notificacion;

public interface Factory {

	void init(String pkname);
	<T> T create(String tema, Notificacion not);
}
