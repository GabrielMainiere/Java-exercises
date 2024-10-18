//Now, at the time of adoption, it is necessary to perform some checks and validations before finalizing the adoption. Firstly, an adoption cannot occur on a date prior to the dog's entry date at PetCare. Your system should also allow for the replacement of people in each adoption. Some important information for the manager of PetCare includes: how long a dog has been at the shelter, whether the dog is well-nourished or not (use a scale of 0 to 20kg - Malnourished; 21kg to 30kg - Normal; and above 30kg - Obese), and how long the dog has been adopted. Implement functions and procedures for these cases.


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
    
    public boolean hasBreed() {
        if(!breed.equals("Mixed Breed")){
            return true;
        }
        else {
            return false;
        }
   }

   public void nutritionStatus() {
        if(weight > 0 && weight <= 20) {
            System.out.println("Pet's Condition: Malnourished!");
        }
        else if(weight > 20 && weight <= 30) {
            System.out.println("Pet's Condition: Normal");
        }
        else {
            System.out.println("Pet's Condition: Obese"); 
        }
   }
}
