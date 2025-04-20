package ex_03_Inheritance.MultiLevelInheritance;

public class Father extends GrandFather {
    int f_money;
    void f(){
        System.out.println("2BHK-F");
    }
    void home(){
        System.out.println("--");
        System.out.println("Father-S2");
        super.home();

    }
}
