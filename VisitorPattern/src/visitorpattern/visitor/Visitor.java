/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package visitorpattern.visitor;

import visitorpattern.book.BusinessBook;
import visitorpattern.book.DesignPatternBook;
import visitorpattern.book.JavaCoreBook;

/**
 *
 * @author Administrator
 */
public interface Visitor {
 
    void visit(BusinessBook book);
 
    void visit(DesignPatternBook book);
 
    void visit(JavaCoreBook book);
}