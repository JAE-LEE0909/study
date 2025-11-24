import java.util.*;

class example1{
    public static void main(String[] args) {
        vector v = new vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        print(v);

        v.trimToSize();
        System.out.println("======After trimToSize()======");

        print(v)

        v.setSize(7);
        System.out.println("======After setSize(7)======")

    }
}