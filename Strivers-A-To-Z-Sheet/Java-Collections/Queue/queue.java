import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(7);
        q.add(3);
        // System.out.println(q);
        for (int i : q) {
            System.out.println(i);
        }

    }
}
