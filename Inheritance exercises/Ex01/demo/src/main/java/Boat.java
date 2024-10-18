// Create a parent class called Vehicle and three child classes named Car, Airplane, and Boat. The cars have a registration number and license plate, the boats have a registration number, and the airplanes have an aircraft registration number.

// a. Implement an individual constructor for each child class.

// b. The Vehicle class should have the methods start, stop, moveForward, reverse, and halt. The Airplane class should have the methods takeOff and land. The Boat class should have the methods sail and anchor. The Car class should have the methods brake and shiftGear.

// c. Note that no child vehicle can execute any function if it is turned off. Additionally:
// i. The car cannot shift gears while it is stopped.
// ii. The boat cannot sail while it is anchored.
// iii. The airplane cannot land if it has not taken off, and vice-versa.

//d. Instantiate an airplane, a boat, and a car.

public class Boat extends Vehicle {
    private String registrationNumber;

    boolean isAnchored = false;

    public Boat() {
    }

    public Boat(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void anchor() {
        if (isOn && !isAnchored) {
            System.out.println("The boat has anchored!");
            isAnchored = true;
        } else {
            System.out.println("The boat is off or already anchored!");
        }
    }

    public void sail() {
        if (isOn && !isAnchored) {
            System.out.println("The boat is sailing!");
        } else {
            System.out.println("The boat is off or anchored, so it cannot sail!");
        }
    }
}

