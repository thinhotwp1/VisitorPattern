
package visitorsample.visitor;

import visitorsample.Characterr;
import visitorsample.Knight;
import visitorsample.Monster;

public class AttackVisitor implements Visitor {

    @Override
    public void visit(Characterr character) {
        if (character instanceof Knight) {// check xem character là knight hay monter
            System.out.println("The character is a Knight: -15hp");
            character.setHp(character.getHp() - 15);
            System.out.println("Knight Hp: " + character.getHp());
        } else if (character instanceof Monster) {
            System.out.println("The character is a Monster: -20hp");
            character.setHp(character.getHp() - 20);
            System.out.println("Monster Hp: " + character.getHp());
        } else {
            System.out.println("The character is not isxisted");
        }
    }
}