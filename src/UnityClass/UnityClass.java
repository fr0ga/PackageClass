package UnityClass;

import PackageClass.PackageClass;

/**
 * Created by Andrey on 04.01.2017.
 */
public class UnityClass {
    public static void main(String[] args) {
        PackageClass packageClass = new PackageClass();

        //System.out.println(packageClass.p); // no access to private
        //System.out.println(packageClass.k); // no access to package-private
        //System.out.println(packageClass.u); // // access to protected
        System.out.println(packageClass.i); // access to public

    }
}
