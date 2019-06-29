package gestorAplicacion.users;

import java.util.HashMap;

import BaseDatos.Data;
import uiMain.MenuDeConsola;
import uiMain.Main;

public class User {
	
	private String name;
	private String username;
	private String email;
	private String password;
	private MenuDeConsola menu;
	
	
	protected User() {
	}

	protected User(String name, String username, String email, String password, MenuDeConsola menu) {
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.menu = menu;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public MenuDeConsola getMenu() {
		return menu;
	}

	public void setMenu(MenuDeConsola menu) {
		this.menu = menu;
	}
	
	public static String newUser(String name, String username, String email, String password, MenuDeConsola menu){
		User user = new User();
		//Validaciones de cada parametro
		user.setName(name);
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setMenu(menu);
		
		if(true){
			Data.users.put(username,user);
			Data.escribirUsuarios(user);
			return "Ha sido creado";
		}else{
			return "No ha sido creado...";
		}
	}
	
	public static String editUser(User u,int option, String value){
		switch (option) {
		case 1:	
			u.setName(value);
			return "Nombre modificado";
		case 2:
			u.setPassword(value);
			return "Contraseña modificada";
		default:
			return "Opcion no valida";
		}
	}
	
	public static String deleteUser(String username){
		Data.users.remove(username);
		return "Ha sido eliminado";
	}
	
	public static User getUserByUsername(String username){
        return Data.users.get(username);
    }
	
	public HashMap<String, User> getUsers(){
		return Data.users;
	}
	
    public static String login(String username, String password){
        User u = User.getUserByUsername(username);
        if (u != null){
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
            	//Seteo el usuario
            	Main.user = u;
                return "Bienvenido";
            }
        }
        return "Usuario no encontrado";
    }
    
    public static String signOut(){
    	Main.user = getUserByUsername("default");
        return "Adios";
    }
    
	
	public String editMyUser(int option, String value){
		switch (option) {
		case 1:	
			this.setName(value);
			return "Nombre modificado";
		case 2:
			this.setPassword(value);
			return "Contraseña modificada";
		default:
			return "Opcion no valida";
		}
	}

	
}

