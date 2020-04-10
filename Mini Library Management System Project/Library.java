import java.util.ArrayList;
public class Library {
  
  public static ArrayList<Member> MemberArray;
  public static ArrayList<Book> BookArray;
  
  static { //static block
    MemberArray = new ArrayList<Member>();
    BookArray = new ArrayList<Book>();
  }
  
}