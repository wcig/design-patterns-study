package org.example.wcig.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }

    private static void example1() {
        BulletPool pool = new BulletPool();
        for (int i=0; i<10; i++) {
            Bullet b = pool.getBullet();
            System.out.println(b);
        }
    }

    private static void example2() {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s1 == s2); // true
        System.out.println(s3 == s4); // false
        System.out.println(s1 == s3); // false
        System.out.println(s1.intern() == s3.intern()); // true
        System.out.println(s3.intern() == s4.intern()); // false
    }

    private static void example3() {
        Integer n1 = Integer.valueOf(100);
        Integer n2 = Integer.valueOf(100);
        System.out.println(n1 == n2); // true
    }
}

class Bullet {
    public UUID id = UUID.randomUUID();
    boolean living = true;

    @Override
    public String toString() {
        return "Bullet{" +
                "id=" + id +
                ", living=" + living +
                '}';
    }
}

class BulletPool {
    List<Bullet> bullets = new ArrayList<>();
    {
        for (int i=0; i<5; i++) {
            bullets.add(new Bullet());
        }
    }

    public Bullet getBullet() {
        for (Bullet b : bullets) {
            if (b.living) {
                return b;
            }
        }
        return new Bullet();
    }
}
