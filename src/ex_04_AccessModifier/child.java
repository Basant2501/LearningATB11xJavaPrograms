package ex_04_AccessModifier;

public class child extends ProtectedTest{
    public static void main(String[] args) {
        child c = new child();
        System.out.println("value_c:"+c.value);
        c.value=15;
        System.out.println("value_c:"+c.value);
        ProtectedTest pr=new child();
        System.out.println("value_pr:"+pr.value);
        pr.value=20;
        System.out.println("value_pr:"+pr.value);
        System.out.println("value_c:"+c.value);
        c.show();
        pr.show();
        ProtectedTest pt= new ProtectedTest();
        pt.show();


    }
}

