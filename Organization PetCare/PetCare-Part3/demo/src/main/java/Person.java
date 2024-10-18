// Next, in your main method, create an ArrayList of adoptions and check:
// a. If there is any dog with a given name;
// b. Which dog has been adopted for the longest time;
// c. How many dogs of the Mixed Breed have been adopted.

public class Person {
    private String name; 
    private String address; 
    private String phone; 
    private String email; 
    private String gender; 
    // private Pet pet;

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
