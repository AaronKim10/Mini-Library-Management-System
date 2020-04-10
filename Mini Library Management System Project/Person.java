public class Person {
 
 private String firstName;
 private String lastName;
 private Address address;
   
 //Constructor for person
 public Person(String firstName, String lastName, Address address) {
   this.firstName = firstName;
   this.lastName = lastName;
   this.address = address;
 }
 //empty constructor
 public Person() {}
 
 //setters and getters for firstName, lastName, and address
 public void setFirstName(String firstName) {
   this.firstName = firstName;
 }
 public void setLastName(String lastName) {
   this.lastName = lastName;
 }
 public void setAddress(Address address) {
   this.address = address;
 }
 public String getFirstName() {
   return this.firstName;
 }
 public String getLastName() {
   return this.lastName;
 }
 public Address getAddress() {
   return this.address;
 }
 
 public String toString() {
   return (firstName + " " + lastName + " " + address.getStreetNo() + " " + address.getZipCode() + 
           " " + address.getCity() + " " + address.getState());
 }
}
