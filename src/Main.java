import java.util.Scanner;
import java.io.IOException;

public class Main{
	private static void print_main_menu(){
		//buscar dades_gestió dades
		System.out.println("Escull alguna d'aquestes opcions: ");
		System.out.println("
				1- Crear Partida \n
				2- Carregar Partida \n
				3- Generar KenKen  \n
				4- Elimina l'usuari \n
				5- Tutorial sobre com jugar al KenKen
			");
	}
	public static void main(){
		Scanner in = new Scanner(System.in);
		MainController mc = new MainController();
		Perfil user = mc.login();
		print_main_menu();
		int opcio;
		while(in.hasNextInt()){
			opcio = in.nextInt();
			switch(opcio){
				case 1:
					mc.new_game();
					break;
				case 2:
					mc.load_game();
					break;
				case 3:
					mc.create_kenken();
					break;
				case 4:
					mc.delete_user();
					break;
				case 5:
					mc.showtutorial();
					break;
				default:
					print_main_menu();
					break;
			}
		}
	}
}
