package roadmap.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

class ValidAnagaram {

   /*
   * intial Solution I came through was to use Hashmap
   * here is my version of solution which
   * to check if length of two strings are not equal return false
   *
   * add all elements of s in hashmap and check elements of t are present in the map if not return false if present decrement to evaluate if element is appearing only once
   * */
    public boolean isValidAnagram(String s , String t){

        char[] i = s.toCharArray();
        char[] j = t.toCharArray();
        Arrays.sort(i);
        Arrays.sort(j);
        return Arrays.equals(i,j);

    }



    public static void main(String args[]){
        ValidAnagaram s = new ValidAnagaram();

        System.out.println(new ValidAnagaram().isValidAnagram("anagram","nagaram"));

    }
}