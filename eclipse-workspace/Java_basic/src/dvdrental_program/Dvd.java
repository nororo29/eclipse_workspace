package dvdrental_program;


public class Dvd {
	private String ISBN;
	private String name;
	private String genre;
	private String date;
	private boolean canRent;
	private int customerId;
	
	public Dvd(String isbn, String name, String genre) {
		this.ISBN = isbn;
		this.name = name;
		this.genre = genre;
		this.canRent = true;
		this.date = "";
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isCanRent() {
		return canRent;
	}

	public void setCanRent(boolean canRent) {
		this.canRent = canRent;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
}
