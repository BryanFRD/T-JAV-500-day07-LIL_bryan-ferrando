import java.util.ArrayList;
import java.util.List;

public class Battalion {

    private List<Character> characters = new ArrayList<>();

    public void add(List<Character> characters) {
        this.characters.addAll(characters);
    }

    public void display() {
        for (Character character : characters) {
            System.out.println(character.getName());
        }
    }

    public void fight(){

    }

}
