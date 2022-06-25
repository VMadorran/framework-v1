package madorran.frameworks;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Menu {

	List<Accion> acciones = new ArrayList<Accion>();
	String pathProperties;

	public Menu(String pathProperties) throws Exception {
		if (pathProperties == null)
			throw new Exception("El path ingresado es nulo");
		this.pathProperties = pathProperties;
	}

	public void iniciar() {

		Properties prop = new Properties();
		try {
			InputStream configFile = getClass().getResourceAsStream(this.pathProperties);
			prop.load(configFile);
			String clase = prop.getProperty("clase");
			String[] clases = clase.split(";");
			for (int i = 0; i < clases.length; i++) {
				Class c = Class.forName(clases[i]);
				this.acciones.add((Accion) c.getDeclaredConstructor().newInstance());
			}

			this.mostrarAcciones();
		} catch (Exception e) {
			throw new RuntimeException("No fue posible crear las instancias de acciones... ", e);
		}

	}

	private void mostrarAcciones() {

		int opcionSeleccionada;
		int opcionSalir = this.acciones.size() + 1;
		boolean seguir = true;

		while (seguir) {
			int posicion = 1;
			if (acciones.isEmpty()) {
				System.out.println("No existen acciones para mostrar" + "\n");
			} else {
				System.out.println("Seleccione una opcion");
				for (Accion accion : acciones) {

					System.out.println(posicion + ". " + accion.nombreItemMenu() + "\n" + "	("
							+ accion.descripcionItemMenu() + ")");
					posicion++;
				}
				System.out.println(posicion + ". " + "Salir");

				Scanner scanner = new Scanner(System.in);
				opcionSeleccionada = scanner.nextInt();

				if (opcionSeleccionada == opcionSalir) {
					System.out.println("Finalizó el programa");
					seguir = false;
				} else
					this.ejecutarAccion(opcionSeleccionada - 1);

			}

		}

	}

	private void ejecutarAccion(int numeroAccion) {

		Accion accion = this.acciones.get(numeroAccion);
		accion.ejecutar();

	}

}
