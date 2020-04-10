public class Address {
 
  private String streetNo;
  private String city;
  private String state;
  private int zipCode;
  
  //Basic contructor for private variables
  public Address(String street, String city, String state, int zip) {
    this.streetNo = street;
    this.city = city;
    this.state = state;
    this.zipCode = zip;
  }
  
  //empty constructor
  public Address() {}
  
  //Basic set and get methods with public visibility
  public void setStreetNo(String streetNo) {
    this.streetNo = streetNo;
  }
  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public void setState(String state) {
    this.state = state;
  }
  public String getStreetNo() {
    return this.streetNo;
  }
  public int getZipCode() {
    return this.zipCode;
  }
  public String getCity() {
    return this.city;
  }
  public String getState() {
    return this.state;
  }
  
  //to string method to use later when calling on Address
  public String toString() {
    return (this.streetNo + " " + this.zipCode + " " + this.city + " " + this.state);
  }
}
