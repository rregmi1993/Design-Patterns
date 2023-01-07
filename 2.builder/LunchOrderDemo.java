package Builder;

public class LunchOrderDemo {
	
	public static void main(String[] args) {
		
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("Wheat").condiments("lettuce").dressing("Moyo").meat("Local Chicken");
		
		LunchOrder lunchOrder = builder.build();
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
		
		System.out.println("------------------------------");
		LunchOrder.Builder builder1 = new LunchOrder.Builder();
		builder1.bread("Wheat").dressing("Moyo").meat("Turkey Chicken"); // provide this flexibility to avoid constructor telescoping issue 
		
		LunchOrder lunchOrder2 = builder1.build();
		System.out.println(lunchOrder2.getBread());
		System.out.println(lunchOrder2.getCondiments());
		System.out.println(lunchOrder2.getDressing());
		System.out.println(lunchOrder2.getMeat());
		
		// this is the best example of immutability features 
	}

}
