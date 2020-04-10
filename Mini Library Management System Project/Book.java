public class Book {
 
  protected String bookId;
  protected String title;
  protected String author;
  protected int publicationYear;
  
  //Basic constructor for private variables
  public Book(String Id, String title, String author, int year) {
    this.bookId = Id;
    this.title = title;
    this.author = author;
    this.publicationYear = year;
  }
  
  public Book(){}
  
  //Basic set and get methods with public visibility
  public void setBookId(String bookId) {
    this.bookId = bookId;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public void setPublicationYear(int publicationYear) {
    this.publicationYear = publicationYear;
  }
  public String getBookId() {
    return this.bookId;
  }
  public String getTitle() {
    return this.title;
  }
  public String getAuthor() {
    return this.author;
  }
  public int getPublicationYear() {
    return this.publicationYear;
  }
}
