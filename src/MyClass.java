/**
 * Created by Andrey on 04.01.2017.
 */
public class MyClass {

    private int p = 3;
    int k = 2;
    protected int u = 1;
    public char i = 'i';

}

class MySubClass extends MyClass {

    MySubClass() {
        // p = 6;
        k = 4;
        u = 5;
        i = 'j';
    }

}

class Mains {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        //System.out.println(myClass.p); // no access to private
        System.out.println(myClass.k); // access to package-private
        System.out.println(myClass.u); // access to protected
        System.out.println(myClass.i); // access to public

        System.out.println();

        MySubClass mySubClass = new MySubClass();
        //System.out.println(mySubClass.p); // no access to private
        System.out.println(mySubClass.k); // access to package-private
        System.out.println(mySubClass.u); // access to protected
        System.out.println(mySubClass.i); // access to public

        System.out.println();

        MyClass myClass1 = new MySubClass();
        //System.out.println(myClass1.p); // no access to private
        System.out.println(myClass1.k); // access to package-private
        System.out.println(myClass1.u); // access to protected
        System.out.println(myClass1.i); // access to public


    }
}
