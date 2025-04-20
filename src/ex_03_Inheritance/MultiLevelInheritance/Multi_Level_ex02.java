package ex_03_Inheritance.MultiLevelInheritance;

public class Multi_Level_ex02 {
    public static void main(String[] args) {


//        Son s1 = new GrandFather();
//        Son s1 = new Father();
//We cannot refer parent class object through child class reference

       GrandFather g1 = new Son(); // Dynamic Dispatch
        //Though we can refer child class object with parent class reference
        g1.gf();//1BHK-GF
        ((Son)g1).f();
        ((Son)g1).s();
        g1.home();//S-S3
        g1.gf_money=600;
        System.out.println("gf_money-"+g1.gf_money);
        ((Son) g1).f_money=700;
        System.out.println("f_money-"+ ((Son) g1).f_money);
        ((Son) g1).f();
        GrandFather g2 = new Father();
        g2.home();


        Father f2 = new Son();
        f2.home();

/*You can only access members (methods/variables) that are declared in Grandfather class, because that’s the reference type.
However, if the Son or Father classes override a method from Grandfather, the runtime (JVM) will call the overridden version, thanks to dynamic method dispatch.
You cannot directly call Father or Son specific methods using a Grandfather reference, even though the actual object is of type Son.
Because at compile time, the compiler only knows the reference is of type Grandfather, and checks for method availability in that class only.
In order to call we need to downcast*/



    }
}
