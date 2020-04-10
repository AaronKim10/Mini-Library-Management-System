import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tester {
  public static void main(String args[]){
      org.junit.runner.JUnitCore.main("P2Tester");
    }
  
     Address add = new Address("4486 oakdale","Fairfax","va",22030);
  Librarian lib = new Librarian("John","Smith", add,"001");
     Member mem = new Member("John","Smith", add,"M01", new ArrayList<Book>());
  Member mem2 = new Member("Smith","Lee", add,"M02", new ArrayList<Book>());
  Member mem3 = new Member("Mohammed","Salah", add,"M03", new ArrayList<Book>());
  Book bk1 = new Book("B01","Jhon Adams", "David McCullough",2002);
  Book bk2 = new Book("B02","Python 3", "Doug Hellmann",2007);
  Book bk3 = new Book("B03","The Da Vinci Code", "Dan Brown",2000);
  
 
  ArrayList<Member> mList= new ArrayList<Member>();
 
  
    
    private final double ERR = 0.00001;
    @Test
       public void testAddress_SetGetStreetNo() {
           Address add = new Address();
           add.setStreetNo("test");
           assertEquals(true,(add.getStreetNo()).equals("test"));
       }
    @Test
       public void testAddress_SetGetCity() {
           Address add = new Address();
           add.setCity("test");
           assertEquals(true,(add.getCity()).equals("test"));
       }
    
    @Test
       public void testAddress_SetGetState() {
           Address add = new Address();
           add.setState("test");
           assertEquals(true,(add.getState()).equals("test"));
       }
    
    @Test
       public void testAdress_SetGetZipCode() {
           Address add = new Address();
           add.setZipCode(1);
           assertEquals(1,add.getZipCode());
       }
      
    @Test
       public void testBook_SetGetBookId() {
           Book add = new Book();
           add.setBookId("test");
           assertEquals(true,(add.getBookId()).equalsIgnoreCase("test"));
       }
    
    @Test
       public void testBook_SetGetTitle() {
           Book add = new Book();
           add.setTitle("test");
           assertEquals(true,(add.getTitle()).equals("test"));
       }
    
    @Test
       public void testBook_SetGetAuthor() {
           Book add = new Book();
           add.setAuthor("test");
           assertEquals(true,(add.getAuthor()).equals("test"));
       }
    
    @Test
       public void testBook_SetGetPublicationYear() {
           Book add = new Book();
           add.setPublicationYear(1);
           assertEquals(1,add.getPublicationYear());
       }
   
    @Test
       public void testPerson_SetGetFirstName() {
           Person add = new Person();
           add.setFirstName("test");
           assertEquals(true,(add.getFirstName()).equals("test"));
       }
    
    @Test
       public void testPerson_SetGetLastName() {
           Person add = new Person();
           add.setLastName("test");
           assertEquals(true,(add.getLastName()).equals("test"));
       }
    
    @Test
       public void testPerson_SetGetAddress() {
           Person add = new Person();
           add.setAddress(new Address("test","test","test",0));;
           assertEquals(true,(add.getAddress()).getStreetNo().equals("test"));
           assertEquals(true,(add.getAddress()).getCity().equals("test"));
           assertEquals(true,(add.getAddress()).getState().equals("test"));
           assertEquals(0,(add.getAddress()).getZipCode(),0);
       }
    @Test
    public void testPerson_ToString() {
     Address add = new Address("4486 oakdale","Fairfax","va",22030);
     Person per = new Person("John","Smith", add);
     assertEquals("String Mismatch","John Smith 4486 oakdale 22030 Fairfax va", per.toString());
     
       }
    
    @Test
       public void testMember_SetGetFirstName() {
           Member add = new Member();
           add.setFirstName("test");
           assertEquals(true,(add.getFirstName()).equals("test"));
       }
    
    @Test
       public void testMember_SetGetLastName() {
           Member add = new Member();
           add.setLastName("test");
           assertEquals(true,(add.getLastName()).equals("test"));
       }
    
    @Test
       public void testMember_SetGetAddress() {
           Member add = new Member();
           add.setAddress(new Address("test","test","test",0));;
           assertEquals(true,(add.getAddress()).getStreetNo().equals("test"));
           assertEquals(true,(add.getAddress()).getCity().equals("test"));
           assertEquals(true,(add.getAddress()).getState().equals("test"));
           assertEquals(0,(add.getAddress()).getZipCode());
       }
  
    @Test
       public void testMember_SetGetmemberId() {
     Member add = new Member();
           add.setMemberId("test");
           assertEquals(true,(add.getMemberId()).equals("test"));
       }
    @Test
     public void testMember_SetGetBorrowed() {
            Member add = new Member();
         ArrayList<Book> bList= new ArrayList<Book>();
            bList.add(bk1);
            add.setBorrowedBooks(bList);
            assertEquals(true,(add.getBorrowedBooks().get(0)).getBookId().equals("B01"));
            assertEquals(true,(add.getBorrowedBooks().get(0)).getTitle().equals("Jhon Adams"));
            assertEquals(true,(add.getBorrowedBooks().get(0)).getAuthor().equals("David McCullough"));
           
            assertEquals(2002,(add.getBorrowedBooks().get(0)).getPublicationYear());
        }
    @Test
     public void testMember_BorrowBooks() {
      Member add = new Member();
      ArrayList<Book> bList= new ArrayList<Book>();
       add.setBorrowedBooks(bList);
       add.borrowBooks(bk2);
             
            assertEquals(true,(add.getBorrowedBooks().contains(bk2)));
        }
 
    @Test
     public void testMember_ReturnBooks() {
      Member add = new Member();
      ArrayList<Book> bList= new ArrayList<Book>();
       bList.add(bk2);
       bList.add(bk1);
       add.setBorrowedBooks(bList);
       add.returnBooks(bk1);
            
       assertEquals(false,(add.getBorrowedBooks().contains(bk1)));
        }
    @Test
    public void testMember_ToString() {
     Address add = new Address("4486 oakdale","Fairfax","va",22030);
     Member mem = new Member("John","Smith", add,"001",null);
     assertEquals("String Mismatch","001 John Smith 4486 oakdale 22030 Fairfax va", mem.toString());
     
       }
   
     @Test
        public void testLibrarian_SetGetFirstName() {
            Librarian add = new Librarian();
            add.setFirstName("test");
            assertEquals(true,(add.getFirstName()).equals("test"));
        }
     
     @Test
        public void testLibrarian_SetGetLastName() {
      Librarian add = new Librarian();
            add.setLastName("test");
            assertEquals(true,(add.getLastName()).equals("test"));
        }
     
     @Test
        public void testLibrarian_SetGetAddress() {
      Librarian add = new Librarian();
            add.setAddress(new Address("test","test","test",0));;
            assertEquals(true,(add.getAddress()).getStreetNo().equals("test"));
            assertEquals(true,(add.getAddress()).getCity().equals("test"));
            assertEquals(true,(add.getAddress()).getState().equals("test"));
            assertEquals(0,(add.getAddress()).getZipCode());
        }
   
     @Test
        public void testLibrarian_SetGetEmployeeId() {
      Librarian add = new Librarian();
            add.setEmployeeId("test");
            assertEquals(true,(add.getEmployeeId()).equals("test"));
        }
     
     @Test
        public void testLibrarian_RegisterBooks() {
      Librarian add = new Librarian();
      add.registerBooks(bk1);
      assertEquals(true,(Library.BookArray.contains(bk1)));
      
        }
     
     @Test
        public void testLibrarian_DeleteBooks() {
      Librarian add = new Librarian();
      Library.BookArray.add(bk2);
      assertEquals (true, add.deleteBooks(bk2));
      assertEquals (false, add.deleteBooks(bk1));
      
      assertEquals(false, (Library.BookArray.contains(bk2)));
      
        }
     @Test
        public void testLibrarian_RegisterMembers() {
      Librarian add = new Librarian();
      add.registerMember(mem);
      assertEquals(true, (Library.MemberArray.contains(mem)));
      
        }
      
     @Test
        public void testLibrarian_DeleteMembers() {
      Librarian add = new Librarian();
      Library.MemberArray.add(mem2);
      
      assertEquals(true, add.deleteMember(mem2));
      assertEquals(false, add.deleteMember(mem));
      assertEquals(false, (Library.MemberArray.contains(mem2)));
      
        } 
     
     @Test
        public void testLibrarian_ToString() {
      Address add = new Address("4486 oakdale","Fairfax","va",22030);
      Librarian lib = new Librarian("John","Smith", add,"001");
      assertEquals("String Mismatch","001 John Smith 4486 oakdale 22030 Fairfax va", lib.toString());
      
        }


    /** the lines below are for setting up input/output redirection so that the
      * tests can see what is being set to the screen as well as produce its own
      * pseudo-keyboard input.  No test appear below here. */
    
    static ByteArrayOutputStream localOut, localErr;
    static ByteArrayInputStream localIn;
    static PrintStream sOut, sErr;
    static InputStream sIn;

    @BeforeClass public static void setup() throws Exception {
      sOut = System.out;
      sErr = System.err;
      sIn  = System.in;
    }
    
    @AfterClass public static void cleanup() throws Exception {
      unsetCapture();
      unsetInput();
    }
    
    private static void setCapture() {
     localOut = new ByteArrayOutputStream();
     localErr = new ByteArrayOutputStream();
     System.setOut(new PrintStream( localOut ) );
     System.setErr(new PrintStream( localErr ) );
    }

    private static String getCapture() {
     return localOut.toString().replaceAll("\\r?\\n", "\n");
    }

    private static void unsetCapture() {
     System.setOut( null );
     System.setOut( sOut );
     System.setErr( null );
     System.setErr( sErr );
    }
    
    private static void setInput(String input) {
      localIn = new ByteArrayInputStream(input.getBytes());
      System.setIn(localIn);
    }
    
    private static void unsetInput() throws IOException {
      if (localIn != null) localIn.close();
      System.setIn( null );
      System.setIn( sIn  );
    }
}
