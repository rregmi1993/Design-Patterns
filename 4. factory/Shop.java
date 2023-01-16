package factory;

public class Shop extends Website {

	@Override
	public void creatWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());

	}

}
