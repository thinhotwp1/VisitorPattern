/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visitorsample;

import visitorsample.visitor.Visitor;
import visitorsample.visitor.AttackVisitor;

/**
 *
 * @author Administrator
 */
public class VisitorSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Characterr monter = new Monster();
        Characterr knight = new Knight();
        Visitor v = new AttackVisitor();
        monter.tanCong(v);
        knight.tanCong(v);
    }
    
}
