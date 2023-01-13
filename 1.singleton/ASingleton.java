package singleton;


public class ASingleton {
	
	//private static ASingleton instance = new ASingleton();  // aggressive  loading
	private static volatile ASingleton instance = null; //lazy loading, volatile make the thread safe and use only in primitive data type and object 
	
	private ASingleton() {
		if(instance != null) {
			throw new RuntimeException("use getInstance() method to create objects");
		}
	}
	
	public static ASingleton getInstance() {
		//lazy loading
		if(instance == null) {
			synchronized (instance) { //Locks a single thread with the shared data so that no other thread can access it.
				if(instance == null) {
					instance = new ASingleton();
				}
			}
			
		}
		
		return instance;
	}

}
