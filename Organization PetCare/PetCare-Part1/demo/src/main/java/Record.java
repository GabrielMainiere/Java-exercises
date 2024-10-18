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

import java.time.LocalDate;

public class Record {

    private LocalDate adoptionDate;
    private Pet adoptedDog;
    private Person adopter;

    public Record(LocalDate adoptionDate, Pet adoptedDog, Person adopter) {
        this.adoptionDate = adoptionDate;
        this.adoptedDog = adoptedDog;
        this.adopter = adopter;
    }

    public Record() {
    }

    public LocalDate getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(LocalDate adoptionDate) {
        this.adoptionDate = adoptionDate;
    }

    public Pet getAdoptedDog() {
        return adoptedDog;
    }

    public void setAdoptedDog(Pet adoptedDog) {
        this.adoptedDog = adoptedDog;
    }

    public Person getAdopter() {
        return adopter;
    }

    public void setAdopter(Person adopter) {
        this.adopter = adopter;
    }

    public void printDetails() {
        System.out.println("Adoption Date: " + adoptionDate);
        System.out.println("Adopted Dog: " + adoptedDog.getName());
        System.out.println("Adopter: " + adopter.getName());
    }
}
