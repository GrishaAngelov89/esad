package esad.chapter1.task7;

/**
 * @author: grisha_angelov
 */
public class MyClass {
    class Order {
        public boolean isSame(String s1, String s2) {
            return new Comparator().isSameString(s1, s2);
        }
    }

    class Mail {
        public boolean isSame(String s1, String s2) {
            return new Comparator().isSameString(s1, s2);
        }
    }

    class Comparator {
        boolean isSameString(String s1, String s2) {
            if (s1 == s2)
                return true;
            if (s1 == null)
                return false;
            return (s1.equals(s2));
        }
    }
}
