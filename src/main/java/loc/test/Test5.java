package loc.test;

import java.util.HashSet;

public class Test5 {
    public static class Case5 {
        final private String name;

        public String getName() {
            return name;
        }

        public Case5(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            return true;
        }

        @Override
        public int hashCode() {
            if (name == null) return -1;
            return (name.length() % 2) > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }

    public static void main(String[] args) {
        final var a = new Case5("Johnny");
        final var b = new Case5("Jane");
        final var c = new Case5("Doe");
        final var m = new HashSet<>();
        m.add(a);
        m.add(b);
        m.add(c);
        final var result = m.contains(new Case5("Jane"));
        final var result1 = m.contains(new Case5("Nick"));
        final var result2 = m.contains(new Case5("Doe"));
        final var result3 = m.contains(null);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(m.size());
    }
}
