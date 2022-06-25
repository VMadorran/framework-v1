package madorran.utilizacion;

import java.time.LocalDateTime;

import madorran.frameworks.Accion;

public class Hora implements Accion {

	@Override
	public String descripcionItemMenu() {
		// TODO Auto-generated method stub
		return "Hora actual";
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		System.out.println(LocalDateTime.now().toString());
	}

	@Override
	public String nombreItemMenu() {
		// TODO Auto-generated method stub
		return "Hora";
	}

}
