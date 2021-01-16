package org.example.wcig.builder.example;

public class Test {
    public static void main(String[] args) {
        example1();
        example2();
    }

    private static void example1() {
        TerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain t = builder.builderWall()
                .builderFort()
                .builderMine()
                .build();
    }

    private static void example2() {
        Person p = new Person.PersonBuilder()
                .simple(1, "tom")
                .score(100)
                .address("")
                .build();
    }
}
