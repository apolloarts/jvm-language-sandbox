package hellojava.basic;

import java.util.ArrayList;
import java.util.List;

public class HelloList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        for (String s: list) {
            System.out.println("Hello: " + s);
        }
    }
}
