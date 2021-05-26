package loc.test;

import java.util.HashSet;

public class Test1 {
    public static class Case1 {
        final private String name;

        public String getName() {
            return name;
        }

        public Case1(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        final var a = new Case1("John");
        final var m = new HashSet<>();
        m.add(a);
        final var result = m.contains(new Case1("John"));
        final var result1 = m.contains(a);
        System.out.println(result);
        System.out.println(result1);
    }
}
