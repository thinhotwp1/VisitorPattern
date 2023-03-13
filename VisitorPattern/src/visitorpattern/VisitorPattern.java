/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visitorpattern;

import visitorpattern.book.Book;
import visitorpattern.book.BusinessBook;
import visitorpattern.book.DesignPatternBook;
import visitorpattern.book.JavaCoreBook;
import visitorpattern.visitor.Visitor;
import visitorpattern.visitor.VisitorImpl;

/**
 *
 * @author Administrator
 */
public class VisitorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Book book1 = new BusinessBook();
        Book book2 = new JavaCoreBook();
        Book book3 = new DesignPatternBook();
 
        Visitor v = new VisitorImpl();
        book1.accept(v);
        book2.accept(v);
        book3.accept(v);
    }    
}
