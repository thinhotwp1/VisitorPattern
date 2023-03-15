
package visitorsample;

import visitorsample.visitor.Visitor;

/**
 *
 * @author Administrator
 */
public class Knight implements Characterr{
    private String moTa="Knight";
    private int hp=100;

    @Override
    public void tanCong(Visitor v) {
    // cho visitor quyền quyết định hoạt động của object, khi sửa thì chỉ 
    //cần sửa ở visitor attack
        v.visit(this); 
    }

    @Override
    public void health(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp=hp;
    }
}