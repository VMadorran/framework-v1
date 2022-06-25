package madorran.utilizacion;

import madorran.frameworks.Accion;

public class AccionDos implements Accion {
	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		System.out.println("Se esta ejecutando la accion dos");

	}

	@Override
	public String nombreItemMenu() {
		// TODO Auto-generated method stub

		return "Accion dos";
	}

	@Override
	public String descripcionItemMenu() {
		// TODO Auto-generated method stub
		return "Ejecutará la acccion dos";
	}
}
