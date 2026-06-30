package collections;
import java.util.HashSet;

public class containsDublicate {
public static void main(String[] args) {
int nums[]= {1,2,3,1};
if(contains_dublicate(nums)) {
	System.out.println("Contains dublicate value");
}else {
	System.out.println("Not contains");
}
	
}
public static boolean contains_dublicate(int nums[]) {

    HashSet<Integer> set = new HashSet<>();

    for (int num : nums) {

        if (set.contains(num)) {
            return true;
        }

        set.add(num);
    }

    return false;
} 
}
