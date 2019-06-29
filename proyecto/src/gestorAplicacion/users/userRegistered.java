package gestorAplicacion.users;

import uiMain.MenuDeConsola;

public class userRegistered extends User{
	public userRegistered(MenuDeConsola menu){
		super("Alejandro", "alejo", "alejo@email.com", "12345", menu);
		BaseDatos.Data.users.put("alejo", this);
	}
}
