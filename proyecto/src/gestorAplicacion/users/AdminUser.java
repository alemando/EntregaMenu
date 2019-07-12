package gestorAplicacion.users;

import BaseDatos.Data;
import uiMain.MenuDeConsola;


public class AdminUser extends User{
	
	AdminUser(){
		super();
	}
	
	public AdminUser(String name, String username, String email, String password) {
		super(name, username, email, password);
		Data.users.put(username, this);
	}
	
	public static String newAdminUser(String name, String username, String email, String password){
		AdminUser user = new AdminUser();
		//Validaciones de cada parametro
		user.setName(name);
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		
		//Menu por defecto al crear un nuevo usuario administrador
		String [] operations = {"1","2","3","4","5"};
		MenuDeConsola.newMenu(user, operations);
		if(true){
			Data.users.put(username,user);
			return "Ha sido creado";
		}else{
			return "No ha sido creado...";
		}
	}
}
