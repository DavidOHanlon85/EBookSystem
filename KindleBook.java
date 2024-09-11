/**
 * 
 */
package slideDeckChallenges;

/**
 * This is the KindleBook class
 */
public class KindleBook extends EBook {
	
	// Instance Variables
	
	private boolean downloadedFromAmazon;

	/**
	 * Default constructor
	 */
	public KindleBook() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with args
	 * @param title
	 * @param downloadedFromAmazon
	 */
	public KindleBook(String title, boolean downloadedFromAmazon) {
		super(title);
		this.setDownloadedFromAmazon(downloadedFromAmazon);
	}
	
	// Getters and Setters

	/**
	 * @return the downloadedFromAmazon
	 */
	public boolean isDownloadedFromAmazon() {
		return downloadedFromAmazon;
	}

	/**
	 * @param downloadedFromAmazon the downloadedFromAmazon to set
	 */
	public void setDownloadedFromAmazon(boolean downloadedFromAmazon) {
		this.downloadedFromAmazon = downloadedFromAmazon;
	}

	@Override
	public void readBook() {
		if (downloadedFromAmazon) {
			System.out.println("Great you can read this");
		} else {
			System.out.println("Product not purchased from Amazon - unable to read");
		}

	}

}
