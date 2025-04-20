package ex_04_AccessModifier;

import java.util.Objects;

public class PrivateTest {
    private String secret;
    PrivateTest(String secret){
        this.secret=secret;
    }
    void compareSecret(PrivateTest otherSecret){
        if (Objects.equals(secret, otherSecret.secret))
            System.out.println("Secrets are same");
        else System.out.println("Secret:"+secret+" ; otherSecret:"+otherSecret.secret);
    }
    public static void main(String[] args) {
        PrivateTest Sec1=new PrivateTest("Java");
        PrivateTest Sec2=new PrivateTest("java");
        Sec1.compareSecret(Sec2);

    }
}
//Private members are hidden from other classes, but not from the class itself
// - even when accessing another instance of the same class.
//Because privacy in Java is enforced at the class level, not at the object level.
// So if you’re inside the same class, you can access any private member of any instance of that class.
