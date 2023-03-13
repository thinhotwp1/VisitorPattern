/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitorsample;

import visitorsample.visitor.Visitor;

/**
 *
 * @author Administrator
 */
public class Monster implements Characterr{
    private String moTa="Quái vật";  

    @Override
    public void tanCong(Visitor v) {
        v.visit(this);
    }
}
