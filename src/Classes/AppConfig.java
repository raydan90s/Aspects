package Classes;

public class AppConfig {
	private static AppConfig instance;
	private String theme; 
	private String language;
	
	private AppConfig() {
		this.theme = "Dark";
		this.language = "English";
	}
	
	public static AppConfig getInstance() {
		if (instance == null) {
			instance = new AppConfig();
		}
		return instance;
	}
	
	public String getTheme() {
		return theme;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
}


