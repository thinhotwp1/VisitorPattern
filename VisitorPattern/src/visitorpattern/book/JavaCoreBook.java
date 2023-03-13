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
public class JavaCoreBook implements ProgramingBook {
 
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
 
    @Override
    public String getResource() {
        return "https://github.com/gpcodervn/Java-Tutorial/";
    }
 
    public String getFavouriteBook() {
        return "The most favourite book of java core";
    }
}