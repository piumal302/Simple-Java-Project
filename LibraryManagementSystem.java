class LibraryManagementSystem{
	public static void main(String[] args){
		Book b1=new Book("The Catcher in the Rye","B001","J.D. Salinger",240);
		Book b2=new Book("To Kill a Mockingbird","B002","Harper Lee",281);
		Book b3=new Book("1984","B003","George Orwell",328);
		Book b4=new Book("Pride and Prejudice","B004","Jane Austen",432);
		Book b5=new Book("The Hobbit","B005","J.R.R. Tolkien",320);
		
		
		Magazine m1=new Magazine("National Geographic","M001","August 2023","National Geographic Society");
		Magazine m2=new Magazine("Time","M002","September 2023","Time USA, LLC");
		Magazine m3=new Magazine("Forbes","M003","June 2023","Forbes Media");
		Magazine m4=new Magazine("Vogue","M004","July 2023","Condé Nast");
		Magazine m5=new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");
		
		LibraryMember lm1=new LibraryMember("L001","John Doe");
		LibraryMember lm2=new LibraryMember("L002","Jane Smith");
		LibraryMember lm3=new LibraryMember("L003","David Johnson");
		LibraryMember lm4=new LibraryMember("L004","Sarah Williams");
		LibraryMember lm5=new LibraryMember("L005","Michael Brown");
		
	
	
		b1.checkOut();
        b1.checkIn();

        
        LibraryItem[] libraryItems = {b1, b2, b3, b4, b5 ,m1,m2,m3,m4,m5};
        LibraryMember[] libraryMembers = { lm1, lm2, lm3, lm4, lm5 };

        System.out.println("Library Items :");
        for (LibraryItem item : libraryItems) {
            item.displayItemDetails();
            System.out.println();
        }

        System.out.println("Library Members:");
        for (LibraryMember member : libraryMembers) {
            member.displayMemberDetails();
            System.out.println();
        }
		
	}
}