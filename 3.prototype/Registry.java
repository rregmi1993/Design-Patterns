package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String, Item> items = new HashMap<>();
	
	public Registry() {
		loadItems();
	}
	
	public Item createItem(String type) {
		Item item = null;
		try {
			item = (Item)(items.get(type)).clone(); 
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}
	
	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("3 Iditos");
		movie.setPrice(1000);
		movie.setRuntime("2:30 hrs");
		items.put("Movie", movie);
		
		
		Book book = new Book();
		book.setNumberOfPage(355);
		book.setPrice(100);
		book.setTitle("Java creational design");
		items.put("Book", book);
	}

}
