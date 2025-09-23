package KillEnemies;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    static void main(String[] args) {
        ArrayList<KillEnemies.Character> character = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            character.add(new Friend());
        }
        for (int i = 0; i < 5; i++) {
            character.add(new Enemy());
        }
        Collections.shuffle(character);
        int contador = 1;
        for (Character character1 : character){
            if (character1.isEnemy()){
                System.out.println("Character" + contador + " is a enemy! kill it!");
                ((Enemy) character1).kill();
            } else {
                System.out.println("Character" + contador + " is a friend! :-)");
            }
            contador++;
        }
    }
}