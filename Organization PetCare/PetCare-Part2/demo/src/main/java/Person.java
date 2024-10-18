//Now, at the time of adoption, it is necessary to perform some checks and validations before finalizing the adoption. Firstly, an adoption cannot occur on a date prior to the dog's entry date at PetCare. Your system should also allow for the replacement of people in each adoption. Some important information for the manager of PetCare includes: how long a dog has been at the shelter, whether the dog is well-nourished or not (use a scale of 0 to 20kg - Malnourished; 21kg to 30kg - Normal; and above 30kg - Obese), and how long the dog has been adopted. Implement functions and procedures for these cases.

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
