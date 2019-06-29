package uiMain;

import BaseDatos.Data;

public class SignUp extends OpcionDeMenu {

	@Override
	public void ejecutar() {
		Data.escribirUsuarios(null);
	}

	@Override
	public String toString() {
		return "Registrarse";
	}

}
