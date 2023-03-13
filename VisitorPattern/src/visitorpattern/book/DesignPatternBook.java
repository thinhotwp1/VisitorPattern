/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitorpattern.book;

import visitorpattern.visitor.Visitor;

/**
 *
 * @author Administrator
 */
public class DesignPatternBook implements ProgramingBook {
 
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
 
    @Override
    public String getResource() {
        return "https://github.com/gpcodervn/Design-Pattern-Tutorial/";
    }
 
    public String getBestSeller() {
        return "The best Seller of design pattern book";
    }
}
