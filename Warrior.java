public class Warrior extends Character {

    public Warrior(String name, int capacity){
        super(name, "Warrior", capacity);
        life = 100;
        strength = 10;
        agility = 8;
        wit = 3;
        System.out.println(name + ": My name will go down in history!");
    }

    public Warrior(String name) {
        this(name, 0);
    }

    @Override
    public void attack(String arg) {
        if(arg.equalsIgnoreCase("hammer") || arg.equalsIgnoreCase("sword")){
            super.attack(arg);
            System.out.println(name + ": I'll crush you with my " + arg + "!");
        }
    }

    @Override
    public void moveForward() {
        System.out.println(name + ": moves forward like a bad boy.");
    }

    @Override
    public void moveBack() {
        System.out.println(name + ": moves back like a bad boy.");
    }

    @Override
    public void moveRight() {
        System.out.println(name + ": moves right like a bad boy.");
    }

    @Override
    public void moveLeft() {
        System.out.println(name + ": moves left like a bad boy.");
    }

}
