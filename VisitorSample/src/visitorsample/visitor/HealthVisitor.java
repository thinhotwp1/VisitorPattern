/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitorsample.visitor;

import visitorsample.Characterr;
import visitorsample.Knight;
import visitorsample.Monster;

/**
 *
 * @author Administrator
 */
public class HealthVisitor implements Visitor {

    @Override
    public void visit(Characterr character) {
        if (character instanceof Knight) {// check xem character là knight hay monter
            System.out.println("The character is a Knight: + 10hp");
            character.setHp(character.getHp() + 10);
            System.out.println("Knight Hp: " + character.getHp());
        } else if (character instanceof Monster) {
            System.out.println("The character is a Monster: + 15hp");
            character.setHp(character.getHp() + 15);
            System.out.println("Monster Hp: " + character.getHp());
        } else {
            System.out.println("The character is not isxisted");
        }
    }
}