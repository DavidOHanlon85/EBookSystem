/**
 * 
 */
package slideDeckChallenges;

/**
 * Driver class for testing book classes
 */
public class Library {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		KindleBook kindleBook = new KindleBook();
		kindleBook.setDownloadedFromAmazon(true);
		kindleBook.readBook();
		

		KoboBook koboBook = new KoboBook();
		koboBook.readBook();

		KindleBook kb2 = new KindleBook("Catch 22", false);
		
		KoboBook k2 = new KoboBook("Mockingbird");
		
		kb2.readBook();
		k2.readBook();
		
	}

}
