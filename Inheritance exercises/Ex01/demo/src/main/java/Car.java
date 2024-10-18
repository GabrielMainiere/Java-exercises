// Create a parent class called Vehicle and three child classes named Car, Airplane, and Boat. The cars have a registration number and license plate, the boats have a registration number, and the airplanes have an aircraft registration number.

// a. Implement an individual constructor for each child class.

// b. The Vehicle class should have the methods start, stop, moveForward, reverse, and halt. The Airplane class should have the methods takeOff and land. The Boat class should have the methods sail and anchor. The Car class should have the methods brake and shiftGear.

// c. Note that no child vehicle can execute any function if it is turned off. Additionally:
// i. The car cannot shift gears while it is stopped.
// ii. The boat cannot sail while it is anchored.
// iii. The airplane cannot land if it has not taken off, and vice-versa.

//d. Instantiate an airplane, a boat, and a car.

public class Car extends Vehicle {
    private String registrationNumber;
    private String licensePlate;

    public Car() {
    }

    public Car(String registrationNumber, String licensePlate) {
        this.registrationNumber = registrationNumber;
        this.licensePlate = licensePlate;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void brake() {
        if (isOn) {
            System.out.println("The car has braked!");
        } else {
            System.out.println("The car is not on, so it cannot brake!");
        }
    }

    public void shiftGear() {
        if (isOn && !isStopped) {
            System.out.println("The car has changed gears!");
        } else {
            System.out.println("The car is either not on or is stopped, so it cannot change gears!");
        }
    }
}

