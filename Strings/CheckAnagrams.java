/* Question: Check if 2 strings are anagram of each other?
    What are Anagram: 
    -Anagrams are words or phrases formed by rearranging the letters of another word or phrase. For example, the word "silent" and "listen" & "earth" and "heart" & "race" and "care" etc.
 */
package Strings;
import java.util.*;
public class CheckAnagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        //convert both string to lowercase.  Why? so that we don't have to check seperatly for lower and uppercase.
        str1.toLowerCase();
        str2.toLowerCase();

        //First check if both Strings lengths are same or not, if not return false
        if(str1.length() == str2.length()){
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            // Sort both char Arrays 
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            // if the sorted char arrays are same or identical then the strings are areanagram.
            boolean result = Arrays.equals(str1CharArray, str2CharArray);
            if (result == true) {
                System.out.println("'"+str1 +"'"+ " and " + "'"+ str2 +"'"+ " are anagram of each other." );
            } else{
                System.out.println("'"+str1 +"'"+ " and " + "'"+ str2 +"'"+ " are not anagram of each other.");
            }
            //case when lengths are not equals
        }else{
            System.out.println("'"+str1 +"'"+ " and " + "'"+ str2 +"'"+ " are not anagram of each other.");
        }
    }
    
}
