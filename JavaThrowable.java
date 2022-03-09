package throwablepractice;

import java.security.ProviderException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class JavaThrowable {
    public static void main(String[] args) {
        practiceArithmeticException();
        practiceNullPointerException();
        practiceIllegalArgumentException();
        practiceIndexOutOfBoundsException();

        practiceNoSuchElementException();
        practiceArrayStoreException();
        practiceClassCastException();
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

    static void practiceIllegalStateException() {
        System.out.println("--- IllegalStateException ---");
        try {
            // Write Example of IllegalStateException Here
        } catch (IllegalStateException ise) {
            System.out.println("IllegalStateException: " + ise.getMessage());
        }
        System.out.println("----------------------------");
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
            System.out.println("list.add(5) => ");
            System.out.println(list.get(5));
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("IndexOutOfBoundsException: " + ioobe.getMessage());
        }
        System.out.println("----------------------------");
    }

    static void practiceUnsupportedOperationException() {
        System.out.println("--- UnsupportedOperationException ---");
        try {
            // Write Example of UnsupportedOperationException Here
        } catch (UnsupportedOperationException uoe) {
            System.out.println("UnsupportedOperationException: " + uoe.getMessage());
        }
        System.out.println("----------------------------");
    }

    static void practiceSecurityException() {
        System.out.println("--- SecurityException ---");
        try {
            // Write Example of SecurityException Here
        } catch (SecurityException se) {
            System.out.println("SecurityException: " + se.getMessage());
        }
        System.out.println("----------------------------");
    }
    
    static void practiceProviderException() {
        System.out.println("--- ProviderException ---");
        try {
            // Write Example of ProviderException Here
        } catch (ProviderException pe) {
            System.out.println("ProviderException: " + pe.getMessage());
        }
        System.out.println("----------------------------");
    }

    static void practiceNoSuchElementException() {
        System.out.println("--- NoSuchElementException ---");
        try {
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt(); // Input Any Integer
                int b = sc.nextInt(); // No Input or Input Something Except for Integer
                System.out.println("a + b = " + (a + b)); // NoSuchElementException!!
            }
        } catch (NoSuchElementException nsee) {
            System.out.println("NoSuchElementException: " + nsee.getMessage());
        }
        System.out.println("----------------------------");
    }

    static void practiceArrayStoreException() {
        System.out.println("--- ArrayStoreException ---");
        try {
            String[] a = new String[5];
            a[0] = "Hello"; // -> O
            // a[1] = 1; -> X
        } catch (ArrayStoreException ase) {
            System.out.println("ArrayStoreException: " + ase.getMessage());
        }
        System.out.println("----------------------------");
    }

    static void practiceClassCastException() {
        System.out.println("--- ClassCastException ---");
        try {
            // Write Example of ClassCastException Here
        } catch (ClassCastException cce) {
            System.out.println("ClassCastException: " + cce.getMessage());
        }
        System.out.println("----------------------------");
    }

    static void practiceEmptyStackException() {
        System.out.println("--- EmptyStackException ---");
        try {
            // Write Example of EmptyStackException Here
        } catch (EmptyStackException ese) {
            System.out.println("EmptyStackException: " + ese.getMessage());
        }
        System.out.println("----------------------------");
    }
}
