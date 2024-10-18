// A non-profit organization called PetCare, which takes care of abandoned dogs,
// needs a Java program to manage the dogs they keep in their shelter. For this, 
// they need to know the name, date of entry into the shelter, whether the animal 
// has a breed, its color, and weight for monitoring. Eventually, these dogs may 
// be adopted by kind-hearted individuals. However, the owner of the organization 
// wants to keep a record of the people who adopt the animals. Therefore, for the 
// person, it is necessary to know their name, address, phone number, email, gender, 
// and which dog is being adopted. Some information about the adoption is kept on 
// paper and also needs to be digitized. The information in the adoption record 
// includes the adoption date, which dog was adopted, and who adopted it. Develop 
// the system described above by creating the respective classes and instantiating 
// the objects.


public class Person {
    private String name; 
    private String address; 
    private String phone; 
    private String email; 
    private String gender; 
   // private Pet adoptedDog;

    public Person(String name, String address, String phone, String email, String gender) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
    }
    
    public Person() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
