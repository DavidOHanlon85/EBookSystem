/**
 * 
 */
package slideDeckChallenges;

/**
 * 
 */
public class KoboBook extends EBook {

	/**
	 * This is the default constructor
	 */
	public KoboBook() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with args
	 * @param title
	 */
	public KoboBook(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void readBook() {
		System.out.println("Enjoy your read");

	}

}
