import java.util.Objects;

public abstract class Character implements Movable, Comparable<Character> {

    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected final String RPGClass;
    protected int capacity = 0;

    protected Character(String name, String RPGClass, int capacity) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.capacity = capacity;
    }

    protected Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
    }

    public void attack(String arg){
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

    public String getName() {
        return name;
    }

    public int getAgility() {
        return agility;
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public String getRPGClass() {
        return RPGClass;
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back");
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left");
    }

    public final void unsheathe(){
        System.out.println(this.name + ": unsheathes his weapon.");
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
  public int compareTo(Character character) {
    if (Objects.equals(this.getRPGClass(), character.getRPGClass())) {
      if (this.getCapacity() == character.getCapacity()) {
        return 0;
      }
      return this.getCapacity() > character.getCapacity() ? 1 : -1;
    } else {
      if (Objects.equals(this.getRPGClass(), "Warrior")) {
        return this.getCapacity() % character.getCapacity() == 0 ? 1 : -1;
      } else if (Objects.equals(this.getRPGClass(), "Mage")) {
        return character.getCapacity() % this.getCapacity() == 0 ? -1 : 1;
      }
    }
    return 0;
  }

}
