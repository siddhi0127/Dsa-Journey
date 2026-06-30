package collections;
import java.util.HashSet;

public class characterFrequency {
public static void main(String[] args) {
	String str="abcdda";
	char ch[]=str.toCharArray();
	
	HashSet<Character> visited=new HashSet<>();
	for(int i=0;i<ch.length;i++) {
		
		if(visited.contains(ch[i])) {
			continue;
		}
		int count=0;
		for(int j=0;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
			}
		}
		visited.add(ch[i]);
		System.out.println("count of "+ch[i]+" is : "+count);		

	}
}
}
