//Now, at the time of adoption, it is necessary to perform some checks and validations before finalizing the adoption. Firstly, an adoption cannot occur on a date prior to the dog's entry date at PetCare. Your system should also allow for the replacement of people in each adoption. Some important information for the manager of PetCare includes: how long a dog has been at the shelter, whether the dog is well-nourished or not (use a scale of 0 to 20kg - Malnourished; 21kg to 30kg - Normal; and above 30kg - Obese), and how long the dog has been adopted. Implement functions and procedures for these cases.


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

    public void durationAtShelter(){
        Duration d1 = Duration.between(adoptedPet.getEntryDate().atTime(0, 0), adoptionDate.atTime(0, 0));
        System.out.println("Days at the shelter: " + d1.toDays() + " days.");
    }
 
    public void durationSinceAdoption(){
        LocalDate now = LocalDate.now();
        Duration d2 = Duration.between(adoptionDate.atTime(0, 0), now.atTime(0, 0));
        System.out.println("Days since adoption: " + d2.toDays() + " days.");
    }

    public boolean isAdopted(){
        if(adoptedPet.getEntryDate().isBefore(adoptionDate)){
            System.out.println("Adoption completed successfully!");
            return true;
        }
        else{
            System.out.println("Adoption denied! This animal has not yet been admitted.");
            return false;
        }
    }

    public void printDetails(){
        if(isAdopted()){
            System.out.println("Adopter's Name: " + adopter.getName());
            System.out.println("Adopter's Email: " + adopter.getEmail());
            System.out.println("Species: " + adoptedPet.getSpecies());
            if(this.getAdoptedPet().hasBreed()){
                System.out.println("Breed: " + adoptedPet.getBreed());
            }
            else{
                System.out.println("No breed.");
            }
        }
        System.out.println("Adopted Pet: " + adoptedPet.getName());
        adoptedPet.nutritionStatus();
        System.out.println("Adoption Date: " + adoptionDate);
        durationAtShelter();
        durationSinceAdoption();
    }
}
