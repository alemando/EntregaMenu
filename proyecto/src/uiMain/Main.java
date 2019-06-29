package uiMain;

import gestorAplicacion.users.User;
import gestorAplicacion.users.userRegistered;

import java.util.ArrayList;

import BaseDatos.Data;
import gestorAplicacion.users.GuestUser;

public class Main {

	public static User user;
	
	public static void main(String[] args) {
		Main.startConfigs();
		//TODO: condicion de break
		while(true) {
			Main.user.getMenu().lanzarMenu();
		}
	}
	
	public static void startConfigs() {
		Data.cargarDatos();
		//Cargar las opciones del programa primero
		Data.operations.put("1", new Login());
		Data.operations.put("2", new SignUp());
		Data.operations.put("3", new SignOut());
		
		
		//Usuario invitado(por defecto)
		Main.user = GuestUser.newGuestUser();
		
		
		ArrayList<OpcionDeMenu> userOptions = new ArrayList<OpcionDeMenu>(){
			{
				add(Data.operations.get("3"));
			}
		};
		
		MenuDeConsola userMenu = new MenuDeConsola(userOptions);
		new userRegistered(userMenu);
	}

}
