package factory;

public class Blog extends Website {

	@Override
	public void creatWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());

	}

}
