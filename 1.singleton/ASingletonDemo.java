package singleton;

public class ASingletonDemo {
	
	public static void main(String arr[]) {
		
		ASingleton instance1 = ASingleton.getInstance();
		System.out.println(instance1);
		
		//ASingleton instance = new ASingleton.getInstanceAddress();
		//it will not allow to create 'new' initialization of object 
		
		ASingleton instance2 = ASingleton.getInstance();
		System.out.println(instance2);
		
		//memory reference of the instance1 and instance2 object is same 
		
	}
	
}
