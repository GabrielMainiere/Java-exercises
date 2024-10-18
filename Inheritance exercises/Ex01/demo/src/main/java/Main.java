public class Main {
    public static void main(String[] args) {

        Car car = new Car("1762748", "ANA694");
        Boat boat = new Boat("Brazilian Navy Registration");
        Airplane plane = new Airplane("Brazilian Aeronautical Registration");

        // Testing Car
        car.start();
        car.moveForward();
        car.shiftGear();
        car.brake();
        car.reverseGear();
        car.stop();
        System.out.println();

        // Testing Boat
        boat.start();
        boat.sail();
        boat.anchor();
        boat.stop();
        System.out.println();

        // Testing Plane
        plane.start();
        plane.takeOff();
        plane.land();
        plane.takeOff();
        plane.stop();
    }
}
