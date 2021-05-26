package loc.test;

import java.util.HashSet;

public class Test4 {
    public static class Case4 {
        final private String name;

        public String getName() {
            return name;
        }

        public Case4(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            return true;
        }

        @Override
        public int hashCode() {
            return name != null ? name.length() : 42;
        }
    }

    public static void main(String[] args) {
        final var a = new Case4("John");
        final var b = new Case4("Jane");
        final var m = new HashSet<>();
        m.add(a);
        m.add(b);
        final var result = m.contains(new Case4("Jane"));
        final var result1 = m.contains(new Case4("Nick"));
        System.out.println(result);
        System.out.println(result1);
    }
}
