package loc.test;

import java.util.HashSet;

public class Test3 {
    public static class Case3 {
        final private String name;

        public String getName() {
            return name;
        }

        public Case3(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Case3 case2 = (Case3) o;
            return name != null ? name.equals(case2.name) : case2.name == null;
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }
    }

    public static void main(String[] args) {
        final var a = new Case3("John");
        final var m = new HashSet<>();
        m.add(a);
        final var result = m.contains(new Case3("John"));
        final var result1 = m.contains(a);
        System.out.println(result);
        System.out.println(result1);
    }
}
