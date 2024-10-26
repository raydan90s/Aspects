import Classes.*;

public class App {
	public static void main(String[] args) {
		AppConfig app = AppConfig.getInstance();
		System.out.println("El sistema tiene configuración predeterminada");
		System.out.println("Tema: " + app.getTheme());
		System.out.println("Idioma: " + app.getLanguage());
		
	}

}

