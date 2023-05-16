package string_assign_ques_3;
import java.util.*;
public class count_occurence_substring {
	 public static void main(String[] args) {
	        String str = "Hello world, hello everyone";
	        String substr = "e";
	        int count = countSubstring(str, substr);
	        System.out.println("Substring count: " + count);
	    }

	    public static int countSubstring(String str, String substr) {
	        StringBuilder sb = new StringBuilder(str);
	        int lastIndex = 0;
	        int count = 0;
	        while (lastIndex != -1) {
	            lastIndex = sb.indexOf(substr, lastIndex);
	            if (lastIndex != -1) {
	                count++;
	                lastIndex += substr.length();
	            }
	        }
	        return count;
	    }

}
