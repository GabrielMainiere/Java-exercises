// A gaming company has hired you to build an adventure game called SuperKate. The player will control the main character of the game, named Kate, who will have various functions like jumping, walking, and using different powers acquired throughout the game (she can even keep up to 4 powers to use during the game, which can be switched in real-time). Besides the character Kate, there are other characters like enemies and obstacles. Basically, the SuperKate game has three types of enemies: the BadFish, the MadCat, and the main enemy, Mega Bob. The obstacles are inanimate objects that appear in the game stages. All characters will have energy, and Kate has a certain number of lives. Depending on the type of power used, the energy will be reduced more or less.

// a. Implement the classes for the SuperKate game.

// b. Instantiate Kate, 3 BadFish enemies, and two MadCat enemies.

// c. Create and then instantiate the following powers: SuperBark, Kate's initial power; EyeBeam, which reduces energy by 20% more than the previous one; and RearRocket, which reduces energy by 50% more than the previous one.

// d. Then, make Kate use the first power. After that, switch to the RearRocket power and use it in sequence.

// e. Implement a method in the character that checks which type of power it received and reduces its energy bar accordingly. If the energy is not sufficient, the character should die.

import java.util.ArrayList;

public class Kate {
    private int health;
    private ArrayList<Powers> powers;

    public Kate() {
    }

    public Kate(int health) {
        this.health = health;
        this.powers = new ArrayList<>();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Powers> getPowers() {
        return powers;
    }

    public void setPowers(ArrayList<Powers> powers) {
        this.powers = powers;
    }

    public void addPower(Powers newPower){
        this.powers.add(newPower);
    }

    public void walk(){
        System.out.println("Kate walked through the scenario!");
    }

    public void jump(){
        System.out.println("Kate jumped over an obstacle!");
    }

    public void usePower(String desiredPower, Enemies enemy){
        boolean powerFound = false;
        for(Powers p : powers){
            if(p.getName().equals(desiredPower)){
                System.out.println("Kate used the power " + p.getName());
                applyDamage(p, enemy);
                powerFound = true;
                break;
            }
        }
        if(!powerFound){
            System.out.println("This power doesn't exist, or Kate hasn't acquired it yet!");
        }
    }

    public void applyDamage(Powers usedPower, Enemies targetEnemy){
        int currentEnemyEnergy = targetEnemy.getEnergy();
        int damageDealt = usedPower.getDamage();
        
        currentEnemyEnergy = currentEnemyEnergy - damageDealt;
        if(currentEnemyEnergy <= 0){
            System.out.println("Kate dealt " + damageDealt + " damage to the enemy.");
            System.out.println("Enemy defeated!");
        } else {
            System.out.println("Kate dealt " + damageDealt + " damage to the enemy.");
            System.out.println("Remaining enemy energy: " + currentEnemyEnergy);
        }
    }
}

