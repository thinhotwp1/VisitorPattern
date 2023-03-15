
package visitorsample;

import visitorsample.visitor.Visitor;

/**
 *
 * @author Administrator
 */
public interface Characterr {
    void tanCong(Visitor v);
    void health(Visitor v);
    
    int getHp();
    void setHp(int hp);
}