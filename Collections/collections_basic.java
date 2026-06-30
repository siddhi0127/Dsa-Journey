package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class collections_basic {
public static void main(String[] args) {
	//arraylist declaration
ArrayList<Integer> a=new ArrayList<>();
a.add(1);
a.add(2);
a.add(3);
a.add(4);
a.add(5);
a.add(6);
//printing arraylist
System.out.println("ArrayList --->");
System.out.println(a);
System.out.println("ArrayList By Index --->");
//accessing element by index
System.out.println(a.get(2));
System.out.println("ArrayList addFirst --->");

a.addFirst(77);
System.out.println(a);
System.out.println("ArrayList by loop -->");
//accessing by using loop
for(int a1:a) {
	System.out.print(a1+" ");
}
System.out.println();
System.out.println("List --->");
List<Integer> list=Arrays.asList(1,2,3,4,5,6); //----> cant modify list after assigninggi 
//list.add(3);
System.out.println(list);

System.out.println("HashSet --->");
Set<Integer> set=new HashSet<>();
set.add(10);
set.add(20);
set.add(30);
set.add(50);
set.add(50);
System.out.print(set);
System.out.println();
System.out.println("Hashmap --->");
HashMap<Integer,String> map=new HashMap<>();
map.put(1, "abc");
map.put(2, "pqr");
map.put(3, "xyz");
map.put(4, "abc");
map.put(4, "abc");
System.out.print("HashMap val :"+map);


}
}
