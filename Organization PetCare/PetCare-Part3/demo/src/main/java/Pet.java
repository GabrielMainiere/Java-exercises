// Next, in your main method, create an ArrayList of adoptions and check:
// a. If there is any dog with a given name;
// b. Which dog has been adopted for the longest time;
// c. How many dogs of the Mixed Breed have been adopted.

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
    
    public boolean hasBreed(){
        return !breed.equals("Mixed Breed");
    }
   
    public void nutritionStatus(){
        if(weight > 0 && weight <= 20){
            System.out.println("Pet's Condition: Underweight!");
        }
        else if(weight > 20 && weight <= 30){
            System.out.println("Pet's Condition: Normal");
        }
        else{
            System.out.println("Pet's Condition: Overweight"); 
        }
    }
}
