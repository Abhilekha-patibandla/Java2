package Assignment_3;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		String s1="ear";
		String s2="are";
		char arr[]=s1.toCharArray();
		char arr1[]=s2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
        boolean b=Arrays.equals(arr, arr1);
        if(b) {
        	System.out.println("Anagram");
        }
        else {
        	System.out.println("Not an Anagram");
        }
	}

}
