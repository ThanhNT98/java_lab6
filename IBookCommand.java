package review.interfacee;

public interface IBookCommand {
	void addBook ( Book newBook); // thêm sách
	Book findBookByID(int bookID); // tìm sách
	void updateBook(Book editBook);
}
