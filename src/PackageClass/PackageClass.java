package PackageClass;

/**
 * Created by Andrey on 04.01.2017.
 */
public class PackageClass {

    private int p = 3;
    int k = 2;
    protected int u = 1;
    public char i = 'i';

}

class Main {
    public static void main(String[] args) {
        PackageClass packageClass = new PackageClass();
        //System.out.println(packageClass.p); // no access to private
        System.out.println(packageClass.k); // access to package-private
        System.out.println(packageClass.u); // access to protected
        System.out.println(packageClass.i); // access to public

    }

}

