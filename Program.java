package review.interfacee;

import java.util.Scanner;


public class Program {
	public static void main(String[] args) {
//		BookManager bm = new BookManager();
//		ComputerBook b = new ComputerBook();
//		bm.addBook(b);
//		Book bf=bm.findBookByID(1);
//		if(bf==null) {
//			System.out.println("Not found!");
//		}
//		else {
//			System.out.println("Found");
//		}
//		
//		
		
		int choice;
		Scanner sc= new Scanner(System.in);
		BookManager bm=new BookManager();
		ComputerBook cpt = new ComputerBook();
		
		do {
			System.out.println("Select a function!");
			System.out.println("1.Add a new book");
			System.out.println("2.Find a book");
			System.out.println("3.Update a book");
			System.out.println("4.Exit");
			System.out.println("Select: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				bm.addBook(cpt);
				
				break;
			case 2:
				int bID;
				System.out.println("Enter book ID to find a book: ");
				bID=sc.nextInt();
				Book bf=bm.findBookByID(bID);
				if(bf == null) {
					System.out.println("Not found!");
				}
				else {
					bf.PrintBook();
				}
				break;
			case 3:
				
				bm.updateBook(cpt);
				
				break;
			
			}
		}
		while(choice>=1 && choice <4);
	}
	
}


