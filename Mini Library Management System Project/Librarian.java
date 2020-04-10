public class Librarian extends Person {
  
  private String employeeId;
  
  public Librarian(String firstName, String lastName, Address address, String employeeId) {
    super(firstName, lastName, address);
    this.employeeId = employeeId;
  }
  public Librarian() {
    super();
  }
  
  // setter and getter for employee id
  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }
  public String getEmployeeId() {
    return this.employeeId;
  }
  
  // add the book to BookArray in Library class
  public void registerBooks(Book book) {
    Library.BookArray.add(book);
  }
  
  //if we can remove the book from the book array, it will return true. Otherwise return false
  public boolean deleteBooks(Book book) {
    return Library.BookArray.remove(book);
  }
  // add member to MemberArray in Library class
  public void registerMember(Member member) {
    Library.MemberArray.add(member);
  }
  // if we can remove member from MemberArray then return true, otherwise return false
  public boolean deleteMember(Member member) {
    return Library.MemberArray.remove(member);
  }
  public void listMembers() {
    System.out.printf("%-10s %-10s %-10s %-10s \n", "Member ID", "First Name", "Last Name", "City");
    for (Member info : Library.MemberArray) {
      System.out.printf("%-10s %-10s %-10s %-10s \n", info.getMemberId(), info.getFirstName(), info.getLastName(), info.getAddress().getCity());
      // using getter methods and string formatting, we can print our desired "info table" with the members in MemberArray
    }
  }
  public void listBooks() {
    System.out.printf("%-10s %-20s %-20s %-10d\n", "Book ID", "Title", "Author", "Year Of Publication");
    for (Book info : Library.BookArray) {
      System.out.printf("%-10s %-20s %-20s %-10d\n", info.getBookId(), info.getTitle(), info.getAuthor(), info.getPublicationYear());
    }
  }
  public String toString() {
    return (getEmployeeId() + " " + getFirstName() + " " + getLastName() + " " + getAddress());
  }
}
                                         
    
    