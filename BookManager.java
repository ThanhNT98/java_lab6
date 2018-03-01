package review.interfacee;

import java.util.Scanner;

public class BookManager implements IBookCommand {
	ComputerBook list[]=new ComputerBook[20];
	int count=0;
	
	@Override
	public void addBook(Book newBook) {
		if(count==list.length) {
		System.out.println("List is full!");	
		}
		else {
			 int BookID;
			 String BookTitle;
			 double Price;
			 int Quantity;
			 String Author;
			 String PublisherName;
				
			Scanner sc=new Scanner(System.in);
//			int i;
//			do {
				System.out.println("Enter book's ID:");
				BookID=Integer.parseInt(sc.nextLine());
//				for(i=0;i<count;i++) {
//					if(list[i].BookID == BookID) {
//						System.out.println("The book's ID existed!");
//					}
//				}
//				
//			}
//			while(list[i].BookID == BookID);
			System.out.println("Enter the book's tittle:");
			BookTitle=sc.nextLine();
			System.out.println("Enter the book's price:");
			Price=Double.parseDouble(sc.nextLine());
			System.out.println("Enter the book's quantity:");
			Quantity=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the book's author:");
			Author=sc.nextLine();
			System.out.println("Enter the book's publisher:");
			PublisherName=sc.nextLine();
            list[count++]=new ComputerBook(BookID, BookTitle, Price, Quantity, Author, PublisherName);
			System.out.println("New book has been added!");
			for(int i=0;i<count;i++) {
				list[i].PrintBook();
			}
			
			
		}
		
		
	}

	

	@Override
	public Book findBookByID(int bookID) {
		for(int i=0;i<count;i++) {
			if(list[i].BookID == bookID) {
				return list[i];
			}
		}
		return null;
	}

	@Override
	public void updateBook(Book newBook) {
		
		if(count==0) {System.out.println("Empty list!");
		return;
		}
		int code;
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the code of updated book: ");
		code=Integer.parseInt(sc.nextLine());
		for(int i=0;i<count;i++) {
			if(list[i].BookID == code) {
				String nBookTitle;
				 double nPrice;
				 int nQuantity;
				 String nAuthor;
				 String nPublisherName;
				 
				 System.out.println("Enter book's tittle: ");
				 nBookTitle=sc.nextLine();
				 System.out.println("Enter book's price: ");
				 nPrice=Double.parseDouble(sc.nextLine());
				 System.out.println("Enter book's quantity: ");
				 nQuantity=Integer.parseInt(sc.nextLine());
				 System.out.println("Enter book's author: ");
				 nAuthor=sc.nextLine();
				 System.out.println("Enter book's publisher: ");
				 nPublisherName=sc.nextLine();
				 list[i].setBookTitle(nBookTitle);
				 list[i].setPrice(nPrice);
				 list[i].setQuantity(nQuantity);
				 list[i].setAuthor(nAuthor);
				 list[i].setPublisherName(nPublisherName);
				 System.out.println("The book "+code+" was updated!");
				 list[i].PrintBook();
		
				
			}
		}
		if(flag==0) {
			System.out.println("The book's ID hasn't existed!");
			flag++;
		 
		}
		
		
		
	}
	
}
