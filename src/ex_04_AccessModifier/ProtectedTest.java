package ex_04_AccessModifier;

public class ProtectedTest {
    protected int value=10;
    protected void show(){
        System.out.println("Within ProtectedTest Show");
    };
}

  class ProtectedTest_Main{
    public static void main(String[] args) {
        ProtectedTest pt=new ProtectedTest();
        System.out.println("value_pt:"+pt.value);
        pt.value=9;
        System.out.println("value_pt:"+pt.value);
        pt.show();

    }
}