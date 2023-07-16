abstract class LibraryItem{
	private String title;
	private String itemID;
	private boolean checkedOut;
	
	public LibraryItem(String title,String itemID){
		this.title=title;
		this.itemID=itemID;
		this.checkedOut=false;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getItemID(){
		return itemID;
	}
	
	public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println("Item checked out: " + title);
        } else {
            System.out.println("Item is already checked out: " + title);
        }
    }

    public void checkIn() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println("Item checked in: " + title);
        } else {
            System.out.println("Item is already checked in: " + title);
        }
    }
	
	public void displayItemDetails(){
		System.out.println("Title : " +title);
		System.out.println("Item ID : " +itemID);
		System.out.println("Checked Out: " + (checkedOut ? "Yes" : "No"));
	}
}