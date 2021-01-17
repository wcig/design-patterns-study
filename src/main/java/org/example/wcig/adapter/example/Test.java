package org.example.wcig.adapter.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }

    // String[] -> Set<string>
    private static void example1() {
        String[] arr = new String[]{"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set);
    }

    // InputStream -> Reader
    private static void example2() {
        try {
            FileInputStream fis = new FileInputStream("/Users/yangbo/Desktop/test.txt");
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void example3() {
        Callable<Long> callable = new Task(10000000L);
        Thread thread = new Thread(new RunnableAdapter(callable));
        thread.start();
    }
}
