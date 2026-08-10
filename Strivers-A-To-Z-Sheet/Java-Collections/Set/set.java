import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(7);
        s.add(7);
        s.add(3);
        s.add(5);

        for (int i : s) {
            System.out.println(i);
        }
    }
}
