/**
 * 
 */
/**
 * @author USER
 *
 */
package review.interfacee;
abstract class Book{
	protected int BookID;
	protected String BookTitle;
	protected double Price;
	protected int Quantity;
	
	public abstract void PrintBook();
	public double SubTotal() {
		
		return Price*Quantity*1.1;
	}
	
	public Book() {}
	public Book(int BookID, String BookTitle, double Price, int Quantity) {
		this.BookID = BookID;
		this.BookTitle = BookTitle;
		this.Price = Price;
		this.Quantity = Quantity;
	}
	public int getBookID() {
		return BookID;
	}
	public void setBookID(int bookID) {
		BookID = bookID;
	}
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
}
