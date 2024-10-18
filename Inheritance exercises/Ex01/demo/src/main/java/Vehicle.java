// Create a parent class called Vehicle and three child classes named Car, Airplane, and Boat. The cars have a registration number and license plate, the boats have a registration number, and the airplanes have an aircraft registration number.

// a. Implement an individual constructor for each child class.

// b. The Vehicle class should have the methods start, stop, moveForward, reverse, and halt. The Airplane class should have the methods takeOff and land. The Boat class should have the methods sail and anchor. The Car class should have the methods brake and shiftGear.

// c. Note that no child vehicle can execute any function if it is turned off. Additionally:
// i. The car cannot shift gears while it is stopped.
// ii. The boat cannot sail while it is anchored.
// iii. The airplane cannot land if it has not taken off, and vice-versa.

//d. Instantiate an airplane, a boat, and a car.

public class Vehicle {

    boolean isOn = false;
    boolean isStopped = false;

    public boolean start() {
        if (!isOn) {
            System.out.println("The vehicle is started!");
            isOn = true;
            return true;
        } else {
            System.out.println("The vehicle is already on!");
            return false;
        }
    }

    public boolean stop() {
        if (isOn) {
            System.out.println("The vehicle is stopped!");
            isOn = false;
            isStopped = true;
            return true;
        } else {
            System.out.println("The vehicle is already off");
            isStopped = true;
            return false;
        }
    }

    public void moveForward() {
        if (isOn) {
            System.out.println("The vehicle moved forward!");
        } else {
            System.out.println("The vehicle is off, cannot move forward!");
        }
    }

    public void reverseGear() {
        if (isOn) {
            System.out.println("The vehicle reversed!");
        } else {
            System.out.println("The vehicle is off, cannot reverse!");
        }
    }

    public void park() {
        if (isOn) {
            System.out.println("The vehicle is parked!");
            isStopped = true;
        } else {
            System.out.println("The vehicle is off, so it is already parked!");
            isStopped = true;
        }
    }
}

