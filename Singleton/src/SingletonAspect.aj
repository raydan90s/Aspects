
public aspect SingletonAspect {
	
	private static MySingleton singletonInstance;

    // Punto de corte antes de llamar a getInstance(), crea la instancia si es nula
    before() : call(public static MySingleton MySingleton.getInstance()) {
        if (singletonInstance == null) {
            singletonInstance = new MySingleton(); // Crea la instancia única si aún no ha sido creada
        }
    }

    // Después de llamar a getInstance(), devuelve siempre la misma instancia
    after() returning(MySingleton result) : call(public static MySingleton MySingleton.getInstance()) {
        result = singletonInstance;
    }
    
}
