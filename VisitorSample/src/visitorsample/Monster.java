
package visitorsample;

import visitorsample.visitor.Visitor;

/**
 *
 * @author Administrator
 */
public class Monster implements Characterr{
    private String moTa="Quái vật";  
    private int hp=100;

    @Override
    public void tanCong(Visitor v) {
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