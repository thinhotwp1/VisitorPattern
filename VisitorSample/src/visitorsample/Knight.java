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
public class Knight implements Characterr{
    private String moTa="Knight";

    @Override
    public void tanCong(Visitor v) {
    // cho visitor quyền quyết định hoạt động của object, khi sửa thì chỉ 
    //cần sửa ở visitor attack
        v.visit(this); 
    }
    
}
