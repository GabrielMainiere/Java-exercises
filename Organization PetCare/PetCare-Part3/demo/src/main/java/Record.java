// Next, in your main method, create an ArrayList of adoptions and check:
// a. If there is any dog with a given name;
// b. Which dog has been adopted for the longest time;
// c. How many dogs of the Mixed Breed have been adopted.

import java.time.LocalDate;
import java.time.Duration;

public class Record {

    private LocalDate adoptionDate;
    private Pet adoptedPet;
    private Person adopter;

    public Record(LocalDate adoptionDate, Pet adoptedPet, Person adopter) {
        this.adoptionDate = adoptionDate;
        this.adoptedPet = adoptedPet;
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
    public Pet getAdoptedPet() {
        return adoptedPet;
    }
    public void setAdoptedPet(Pet adoptedPet) {
        this.adoptedPet = adoptedPet;
    }
    public Person getAdopter() {
        return adopter;
    }
    public void setAdopter(Person adopter) {
        this.adopter = adopter;
    }

    public void duration(){
        Duration d1 = Duration.between(adoptedPet.getEntryDate().atTime(0, 0), adoptionDate.atTime(0, 0));
        System.out.println("Days at the shelter: " + d1.toDays() + " days.");
    }
 
    public void durationAdoptedPet(){
        LocalDate now = LocalDate.now();
        Duration d2 = Duration.between(adoptionDate.atTime(0, 0), now.atTime(0, 0));
        System.out.println("Days adopted: " + d2.toDays() + " days.");
    }

    public boolean isAdopted(){
        if(adoptedPet.getEntryDate().isBefore(adoptionDate)){
            return true;
        }
        else{
            return false;
        }
    }

    public void printDetails(){
        if(isAdopted()){
            System.out.println("Adoption successful!");
            System.out.println("Adopter's Name: " + adopter.getName());
            System.out.println("Adopter's Email: " + adopter.getEmail());
            System.out.println("Species: " + adoptedPet.getSpecies());
            if(this.getAdoptedPet().hasBreed()){
                System.out.println("Breed: " + adoptedPet.getBreed());
            }
            else{
                System.out.println("No breed.");
            }
            System.out.println("Adopted Pet: " + adoptedPet.getName());
            adoptedPet.nutritionStatus();
            System.out.println("Adoption Date: " + adoptionDate);
            duration();
            durationAdoptedPet();
        }
        else {
            System.out.println("Adoption denied! This animal has not been admitted yet.");
        }
    }
}
