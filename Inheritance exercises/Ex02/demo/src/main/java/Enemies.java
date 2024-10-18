// A gaming company has hired you to build an adventure game called SuperKate. The player will control the main character of the game, named Kate, who will have various functions like jumping, walking, and using different powers acquired throughout the game (she can even keep up to 4 powers to use during the game, which can be switched in real-time). Besides the character Kate, there are other characters like enemies and obstacles. Basically, the SuperKate game has three types of enemies: the BadFish, the MadCat, and the main enemy, Mega Bob. The obstacles are inanimate objects that appear in the game stages. All characters will have energy, and Kate has a certain number of lives. Depending on the type of power used, the energy will be reduced more or less.

// a. Implement the classes for the SuperKate game.

// b. Instantiate Kate, 3 BadFish enemies, and two MadCat enemies.

// c. Create and then instantiate the following powers: SuperBark, Kate's initial power; EyeBeam, which reduces energy by 20% more than the previous one; and RearRocket, which reduces energy by 50% more than the previous one.

// d. Then, make Kate use the first power. After that, switch to the RearRocket power and use it in sequence.

// e. Implement a method in the character that checks which type of power it received and reduces its energy bar accordingly. If the energy is not sufficient, the character should die.


public class Enemies {
    private int energy;

    public Enemies() {
    }

    public Enemies(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void applyDamage(int damage) {
        energy -= damage;
    }
}
