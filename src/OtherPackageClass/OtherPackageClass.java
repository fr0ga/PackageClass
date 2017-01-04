package OtherPackageClass;

import PackageClass.PackageClass;


/**
 * Created by Andrey on 04.01.2017.
 */
public class OtherPackageClass extends PackageClass {

    public static void main(String[] args) {

        OtherPackageClass otherPackageClass = new OtherPackageClass();

        // System.out.println(otherPackageClass.p); // no access to private
        // System.out.println(otherPackageClass.k); // no access to package private
        System.out.println(otherPackageClass.u); // access to protected
        System.out.println(otherPackageClass.i); // access to public



        PackageClass packageClass = new OtherPackageClass();

        // System.out.println(otherPackageClass.p); // no access to private
        // System.out.println(otherPackageClass.k); // no access to package private
        // System.out.println(packageClass.u); // no access to protected because of (super class) reference PackageClass
        System.out.println(packageClass.i); // access to public

    }
}
