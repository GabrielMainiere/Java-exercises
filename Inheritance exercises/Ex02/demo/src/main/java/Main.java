
public class Main {
    public static void main(String[] args) {
       
        Enemies badFish1 = new Enemies(100);
        Enemies badFish2 = new Enemies(100);
        Enemies badFish3 = new Enemies(100);
        Enemies madCat1 = new Enemies(200);
        Enemies madCat2 = new Enemies(200);

        Kate kate = new Kate(5);

        Powers initialPower = new Powers(20, "Initial Power");
        Powers superBark = new Powers(50, "Super Bark");
        Powers eyeBeam = new Powers(60, "Eye Beam");
        Powers rearRocket = new Powers(90, "Rear Rocket");

        kate.addPower(initialPower);
        kate.addPower(superBark);
        kate.addPower(eyeBeam);
        kate.addPower(rearRocket);

        kate.walk();
        kate.jump();
        kate.walk();
        System.out.println();

        kate.usePower("Initial Power", badFish1);
        badFish1.applyDamage(20);
        System.out.println();
        kate.usePower("Rear Rocket", badFish1);
        badFish1.applyDamage(90);
        System.out.println();
        kate.usePower("Rearrr Rocket", badFish1);
        System.out.println();
        kate.usePower("Eye Beam", madCat1);
        madCat1.applyDamage(60);
        System.out.println();
        kate.usePower("Super Bark", madCat2);
        madCat2.applyDamage(50);
    }
}