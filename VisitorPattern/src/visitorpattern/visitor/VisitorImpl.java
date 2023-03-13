/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitorpattern.visitor;

import visitorpattern.book.BusinessBook;
import visitorpattern.book.DesignPatternBook;
import visitorpattern.book.JavaCoreBook;

/**
 *
 * @author Administrator
 */
public class VisitorImpl implements Visitor {
 
    @Override
    public void visit(BusinessBook a) {
        System.out.println(a.getPublisher());
    }
 
    @Override
    public void visit(DesignPatternBook w) {
        System.out.println(w.getBestSeller());
    }
 
    @Override
    public void visit(JavaCoreBook g) {
        System.out.println(g.getFavouriteBook());
    }
}
