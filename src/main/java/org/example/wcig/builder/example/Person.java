package org.example.wcig.builder.example;

public class Person {
    private int id;
    private String name;
    private int score;
    private String address;

    public Person() {}

    public static class PersonBuilder {
        Person p = new Person();

        public PersonBuilder simple(int id, String name) {
            p.id = id;
            p.name = name;
            return this;
        }

        public PersonBuilder score(int score) {
            p.score = score;
            return this;
        }

        public PersonBuilder address(String address) {
            p.address = address;
            return this;
        }

        public Person build() {
            return p;
        }
    }
}
