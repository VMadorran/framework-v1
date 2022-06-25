package madorran.main;

import madorran.frameworks.Menu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Menu menu = new Menu("/frw/config/config.properties");
			menu.iniciar();
		} catch (Exception e) {
			throw new RuntimeException("Ocurrió un error ", e);
		}
	}

}
