import java.util.*;

public class list {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(3);
        list.add(5);
        list.add(3);

        for (int i : list) {
            System.out.println(i);
        }
    }
}
