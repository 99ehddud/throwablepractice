package throwablepractice;

import java.util.ArrayList;

public class JavaThrowable {
    public static void main(String[] args) {
        practiceArithmeticException();
        practiceNullPointerException();
        practiceIllegalArgumentException();
        practiceIndexOutOfBoundsException();
    }


    static void practiceArithmeticException() {
        System.out.println("---- ArithmeticException ----");
        try {
            System.out.println("\"3/0\" => ");
            System.out.println(3/0);
            // It occurs when Integer divided by zero
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException: " + ae.getMessage());
        }
        System.out.println("-----------------------------");
    }

    static void practiceNullPointerException() {
        System.out.println("--- NullPointerException ---");
        try {
            String a = null;
            System.out.println("a.indexOf(\"str\") => ");
            System.out.println(a.indexOf("str"));
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException: " + npe.getMessage());
        }
        System.out.println("----------------------------");
    }

    static void practiceIllegalArgumentException() {
        System.out.println("--- IllegalArgumentException ---");
        try {
            tmp(1); // -> O
            // tmp("hello"); -> X
        } catch (IllegalArgumentException iae) {
            System.out.println("IllegalArgumentException: " + iae.getMessage());
        }
        System.out.println("----------------------------");
    }
    public static int tmp (int a) {
        return a;
    }

    static void practiceIndexOutOfBoundsException() {
        System.out.println("--- IndexOutOfBoundsException ---");
        try {
            ArrayList<String> list = new ArrayList<>(5);
            list.add("0");
            list.add("1");
            list.add("2");
            list.add("3");
            list.add("4");
            System.out.println(list.get(5));
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("IndexOutOfBoundsException: " + ioobe.getMessage());
        }
        System.out.println("----------------------------");
    }
}
