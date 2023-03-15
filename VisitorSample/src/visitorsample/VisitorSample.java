
package visitorsample;

import visitorsample.visitor.Visitor;
import visitorsample.visitor.AttackVisitor;
import visitorsample.visitor.HealthVisitor;

/**
 *
 * @author Administrator
 */
public class VisitorSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Tăng khả năng mở rộng và bảo trì bằng cách tách các hoạt động ra thành
        các class riêng, khi cần thêm hành động thì thêm 1 actionVisitor, khi bảo
        trì thì chỉ cần sửa ở 1 lớp không phải đụng đến code cũ và không cần sửa 
        ở nhiều chỗ */
        Characterr monter = new Monster();
        Characterr knight = new Knight();
        System.out.println("====== Attack ======");
        Visitor vAttack = new AttackVisitor();
        monter.tanCong(vAttack);
        knight.tanCong(vAttack);
        System.out.println("====== Health ======");
        Visitor vHealth = new HealthVisitor();
        monter.health(vHealth);
        knight.health(vHealth);
    }
    
}