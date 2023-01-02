package singleton;

public class ASingleton {
	
	private static ASingleton instance = new ASingleton();
	
	private ASingleton() {};
	
	public static ASingleton getInstanceAddress() {
		return instance;
	}

}
