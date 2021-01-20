package org.example.wcig.interpreter.example;

public class Test {
    public static void main(String[] args) {
        // List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        // Iterator<String> iterator = list.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        List_<String> list = new ArrayList_<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator_<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
