package BaseDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import gestorAplicacion.users.User;
import uiMain.MenuDeConsola;
import uiMain.OpcionDeMenu;

public class Data {
	public static HashMap<String, User> users = new HashMap<String, User>();
	public static HashMap<String, MenuDeConsola> menus = new HashMap<String, MenuDeConsola>();
	public static HashMap<String, OpcionDeMenu> operations = new HashMap<String, OpcionDeMenu>();
	
	public static void cargarDatos() {
		try{
			/*File directory = new File("temp");
		    if (! directory.exists()){
		        directory.mkdir();
		        // If you require it to make the entire directory path including parents,
		        // use directory.mkdirs(); here instead.
		    }*/
			String ruta = System.getProperty("user.dir")+"\\src\\temp\\";
			/*File yourFile = new File("users.txt");
			yourFile.createNewFile();*/
            FileReader fr = new FileReader(ruta+"users.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            int lines = 0;
            while((line = br.readLine()) != null){
            	lines++;
                String [] user = line.split(";");
                System.out.println(line);
                //TODO: decidir que hacer
            }
            br.close();
        }catch(Exception e){
            System.out.println("Error al leer");
        }
	}
	
	public static void escribirUsuarios(User user) {

		try {
			String ruta = System.getProperty("user.dir")+"\\src\\temp\\";
            FileWriter fw = new FileWriter(ruta+"users.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            String line = "hola;";
            line += "mundo;";
            pw.println(line);
            pw.close();
        } catch (IOException ioObj) {
            System.out.println("Ocurrio un problema");
        }
	}
}
