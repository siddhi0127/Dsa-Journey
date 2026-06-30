package string;

public class validAnagram {
public static void main(String[] args) {
	String  s = "anagram";
	String  t = "nagaram";

if(isAnagram(s,t)) {
	System.out.println("valid Anagram");
}else {
	System.out.println("Not valid anagram");
}
	
}

public static boolean isAnagram(String s,String t) {
	if(s.length()!=t.length()) {
		return false;
	}
	int arr[]=new int[26];
	//counting characters of s
	for(int i=0;i<s.length();i++) {
		arr[s.charAt(i)-'a']++;
	}
	
	//removing characters of t
	for(int i=0;i<t.length();i++) {
		arr[t.charAt(i)-'a']--;
	}
	
	//checking all counts are zero
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			return false;
		}
	}
	return true;
}
}
