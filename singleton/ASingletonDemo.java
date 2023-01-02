package singleton;

public class ASingletonDemo {
	
	public static void main(String arr[]) {
		
		ASingleton instance = ASingleton.getInstanceAddress();
		System.out.println(instance);
		
		//ASingleton instance = new ASingleton.getInstanceAddress();
		//it will not allow to create the new initialization of object 
		
		ASingleton instance2 = ASingleton.getInstanceAddress();
		System.out.println(instance2);
		
	}
	
}
