package madorran.utilizacion;

import java.time.LocalDate;

import madorran.frameworks.Accion;

public class Fecha implements Accion {

	@Override
	public String descripcionItemMenu() {
		// TODO Auto-generated method stub
		return "Fecha de hoy";
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		System.out.println("La fecha de hoy es:" + LocalDate.now().toString() + "\n");
	}

	@Override
	public String nombreItemMenu() {
		// TODO Auto-generated method stub
		return "Fecha";
	}

}
