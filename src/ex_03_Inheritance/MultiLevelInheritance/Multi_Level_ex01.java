package ex_03_Inheritance.MultiLevelInheritance;

public class Multi_Level_ex01 {
    public static void main(String[] args) {

        GrandFather gf = new GrandFather();
        gf.gf();
        gf.home();

        System.out.println("--");

        Father f1 = new Father();
        f1.f();
        f1.gf();
        f1.home();
        f1.gf_money=500;
        System.out.println("gf_money-"+f1.gf_money);
        f1.f_money=900;
        System.out.println("f_money-"+f1.f_money);
        System.out.println(" -- ");

        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();





    }
}
