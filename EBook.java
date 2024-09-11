/**
 * 
 */
package slideDeckChallenges;

/**
 * This is an abstract class for the ebook class
 */
public abstract class EBook {

	// Instance variables
	
	private String title;
	
	// Constructors
	
	/**
	 * This is the default constructor
	 */
	EBook(){
		
	}

	/**
	 * Constructor with args
	 * @param title
	 */
	public EBook(String title) {
		this.setTitle(title);
	} 
	
	// Getters and setters

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	// toString method

	@Override
	public String toString() {
		return "EBook [title=" + title + "]";
	}
	
	// Methods
	
	public abstract void readBook();
	
	
	
	
	
	
	
	
	
}
