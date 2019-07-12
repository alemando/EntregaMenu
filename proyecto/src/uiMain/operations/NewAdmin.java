package uiMain.operations;

import java.util.Scanner;

import BaseDatos.Data;
import gestorAplicacion.users.AdminUser;
import gestorAplicacion.users.User;
import uiMain.OpcionDeMenu;

public class NewAdmin extends OpcionDeMenu {
	
	public NewAdmin(String key){
		super(key);
	}
	
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
		AdminUser.newAdminUser(name, username, email, password);
	}

	@Override
	public String toString() {
		return "Crear nuevo usuario admin";
	}

}
