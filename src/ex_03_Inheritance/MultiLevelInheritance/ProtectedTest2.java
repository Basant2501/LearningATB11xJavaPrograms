package ex_03_Inheritance.MultiLevelInheritance;

import ex_04_AccessModifier.*;
import ex_04_AccessModifier.child;

public class ProtectedTest2 extends ProtectedTest {
    public static void main(String[] args) {
        ProtectedTest2 c = new ProtectedTest2();
        System.out.println("value_c:"+c.value);
        c.value=15;
        System.out.println("value_c:"+c.value);
        ProtectedTest pr=new ProtectedTest2();
        System.out.println("value_pr:"+ ((ProtectedTest2) pr).value);
        ((ProtectedTest2) pr).value=20;
        System.out.println("value_pr:"+ ((ProtectedTest2) pr).value);
        System.out.println("value_c:"+c.value);
        c.show();
        ((ProtectedTest2)pr).show();
        ProtectedTest pt =new ProtectedTest();
        //pt.show();
        //   This Fails because
        //    You're in a different package
        //    You're trying to access a protected member through a superclass reference, not through inheritance
        //
        //Even though ProtectedTest2 extends ProtectedTest, this reference (pt) is not of the subclass type, and the method is not accessible.
        //You can access a protected member in a different package only if:
        //
        //    You are in a subclass,
        //    You access it through a reference of the subclass type




    }
}
