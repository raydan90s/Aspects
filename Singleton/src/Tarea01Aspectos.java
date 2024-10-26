
public class Tarea01Aspectos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySingleton instance1 = MySingleton.getInstance();
        instance1.performAction();
        
        MySingleton instance2 = MySingleton.getInstance();
        System.out.println("Las instancias son iguales: " + (instance1 == instance2));
    }

}
