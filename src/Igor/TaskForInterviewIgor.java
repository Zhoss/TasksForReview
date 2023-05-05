package Igor;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TaskForInterviewIgor {

    public static void task20() {
        System.out.println();
        System.out.println("Задание 20");
        bar();
    }

    static void bar() {
        int x;
        int[] nums = {1, 2, 3};
        for (x = 0; x < nums.length; x++) {
            x += nums[x];
        }
        System.out.println(x);
    }

    public static void task21() {

        System.out.println();
        System.out.println("Задание 21");
        foo();
    }

    static void foo() {
        String m = "Hello";
        System.out.print(m);
        bar(m);
        System.out.print(m);
    }
    static void bar(String m) {
        m += " World!";
    }

    public static void task22() {

        System.out.println();
        System.out.println();
        System.out.println("Задание 22");
        String s1 = "abc";
        String s2 = "abc";
        String s3= new String("abc");
        System.out.println("s1 == s2 ? "+(s1==s2));
        System.out.println("s1 == s3 ? "+(s1==s3));
        System.out.println("s1 equals s3 ? "+(s1.equals(s3)));
    }

    //task23
    public abstract static class OurAbstractClass {
        public OurAbstractClass() {
            System.out.println("This is abstract class constructor");
        }
    }
    static class OurDemoClass extends OurAbstractClass {
        public OurDemoClass() {
            System.out.println("This is demo class constructor");
        }
        public static void main(String[] args) {
            OurDemoClass ourDemoClass = new OurDemoClass();
        }
    }
}
