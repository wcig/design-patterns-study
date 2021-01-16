package org.example.wcig.prototype.example;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        example1();
        example2();
    }

    private static void example1() {
        String[] arr = {"a", "b", "c"};
        String[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));

        arr[0] = "z";
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));
    }

    // out:
    // [a, b, c]
    // [a, b, c]
    // [z, b, c]
    // [a, b, c]

    private static void example2() {
        Student s1 = new Student(1, "tom");
        Student s2 = (Student) s1.clone();
        Student s3 = s1.copy();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    // out:
    // Student{id=1, name='tom'}
    // Student{id=1, name='tom'}
    // Student{id=1, name='tom'}
}
