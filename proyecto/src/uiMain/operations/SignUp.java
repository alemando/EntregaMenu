package uiMain.operations;

import java.util.Scanner;

import BaseDatos.Data;
import gestorAplicacion.users.User;
import uiMain.OpcionDeMenu;

public class SignUp extends OpcionDeMenu {
	@Override
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese su nombre: ");
		String name = leer.next();
		System.out.print("Ingrese su nombre de usuario: ");
		String username = leer.next();
		System.out.print("Ingrese su email: ");
		String email = leer.next();
		System.out.print("Ingrese su contraseña: ");
		String password = leer.next();
		User.newUser(name, username, email, password);
	}

	@Override
	public String toString() {
		return "Registrarse";
	}

}
