
public class MySingleton {
	private static MySingleton instance; // La instancia será manejada por el aspecto

    protected MySingleton() {
        System.out.println("Singleton instance created");
    }

    public static MySingleton getInstance() {
        return instance; // El aspecto gestionará la creación y retorno de esta instancia
    }

    public void performAction() {
        System.out.println("Ejecutando acción en Singleton");
    }
}
