package loc.test;

import java.util.HashSet;

public class Test2 {
    public static class Case2 {
        final private String name;

        public String getName() {
            return name;
        }

        public Case2(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Case2 case2 = (Case2) o;
            return name != null ? name.equals(case2.name) : case2.name == null;
        }
    }

    public static void main(String[] args) {
        final var a = new Case2("John");
        final var m = new HashSet<>();
        m.add(a);
        final var result = m.contains(new Case2("John"));
        final var result1 = m.contains(a);
        System.out.println(result);
        System.out.println(result1);
    }
}
