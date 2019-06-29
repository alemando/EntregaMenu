package gestorAplicacion.users;

import java.util.ArrayList;

import BaseDatos.Data;
import uiMain.Main;
import uiMain.MenuDeConsola;
import uiMain.OpcionDeMenu;

public class GuestUser extends User {
	
	public GuestUser(MenuDeConsola menu) {
		super("", "default", "", "", menu);
		
		BaseDatos.Data.users.put("default", this);
	}
	
	public static GuestUser newGuestUser() {
		ArrayList<OpcionDeMenu> guestOptions = new ArrayList<OpcionDeMenu>(){
			{
				add(Data.operations.get("1"));
				add(Data.operations.get("2"));
			}
		};
		
		MenuDeConsola guestMenu = new MenuDeConsola(guestOptions);
		return new GuestUser(guestMenu);
	}
	
}
