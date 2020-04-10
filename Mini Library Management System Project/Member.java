import java.util.ArrayList;
public class Member extends Person {
  
  private String memberId;
  private ArrayList<Book> borrowedBooks = new ArrayList<Book>();
  
  //basic constructor 
  @SuppressWarnings("unchecked")
  public Member(String firstName, String lastName, Address address, String memberId, ArrayList borrowedBooks) {
    super(firstName, lastName, address);
    this.memberId = memberId;
    this.borrowedBooks = borrowedBooks;
  }
  
  public Member() {
    super();
  }
  
  //setter and getter methods for memberId and borrowedBooks
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }
  public String getMemberId() {
    return this.memberId;
  }
  public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
    this.borrowedBooks = borrowedBooks;
  }
  public ArrayList<Book> getBorrowedBooks() {
    return this.borrowedBooks;
  }

  //add book to borrowedBooks list
  public void borrowBooks(Book book) {
    this.borrowedBooks.add(book);
  }
  
  //remove book from borrowedBooks list if returned
  public void returnBooks(Book book) {
    this.borrowedBooks.remove(book);
  }
  
  public void listBorrowedBooks() {
    System.out.printf("%-10s %-20s %-20s %-10d\n", "Book ID", "Title", "Author", "Year Of Publication");
    for (Book info : this.borrowedBooks) {
      System.out.printf("%-10s %-20s %-20s %-10d\n", info.getBookId(), info.getTitle(), info.getAuthor(), info.getPublicationYear());
      //iterate through the books in borrowedBooks list and print the info table using getter methods and string formatting
    }
  }
  
  public String toString() {
    return (memberId + " " + getFirstName() + " " + getLastName() + " " + getAddress());
  }
  
}
    