package uiMain;

import gestorAplicacion.users.User;

public class SignOut  extends OpcionDeMenu{

	@Override
	public void ejecutar() {
		System.out.println("Adios");
		Main.user = User.getUserByUsername("default");
		
	}

	@Override
	public String toString() {
		return "Cerrar Sesión";
	}

}
