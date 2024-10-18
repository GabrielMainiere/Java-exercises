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

public class Pet {
   private String name; 
   private LocalDate entryDate; 
   private String breed; 
   private String color; 
   private double weight;
   private String species;

    public Pet(String name, LocalDate entryDate, String breed, String color, double weight, String species) {
        this.name = name;
        this.entryDate = entryDate;
        this.breed = breed;
        this.color = color;
        this.weight = weight;
        this.species = species;
    }

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}

