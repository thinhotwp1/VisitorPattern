/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitorsample.visitor;

import visitorsample.Characterr;
import visitorsample.Knight;
import visitorsample.Monster;

public class AttackVisitor implements Visitor {

    @Override
    public void visit(Characterr character) {
        if (character instanceof Knight) {// check xem character là knight hay monter
            System.out.println("The character is a Knight: -5hp");
        } else if (character instanceof Monster) {
            System.out.println("The character is a Monster: -10hp");
        } else {
            System.out.println("The character is not isxisted");
        }
    }
}
