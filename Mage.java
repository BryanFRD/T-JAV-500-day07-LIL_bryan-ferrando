public class Mage extends Character {

    public Mage(String name, int power) {
        super(name, "Mage", power);
        life = 70;
        strength = 3;
        agility = 10;
        wit = 10;
        System.out.println(name + ": May the gods be with me.");
    }

    public Mage(String name){
        this(name, 0);
    }

    @Override
    public void attack(String arg) {
        if(arg.equalsIgnoreCase("magic") || arg.equalsIgnoreCase("wand")){
            super.attack(arg);
            System.out.println(name + ": Feel the power of my " + arg + "!");
        }
    }

    @Override
    public void moveForward() {
        System.out.println(name + ": moves forward furtively.");
    }

    @Override
    public void moveBack() {
        System.out.println(name + ": moves back furtively.");
    }

    @Override
    public void moveRight() {
        System.out.println(name + ": moves right furtively.");
    }

    @Override
    public void moveLeft() {
        System.out.println(name + ": moves left furtively.");
    }

}
