package string;

public class FirstOccurence {

    public static int strStr(String haystack, String needle) {
      if(!haystack.contains(needle))
      {
          return -1;
      }
      int ind=0;
        for (int i = 0; i < haystack.length() ; i++) {
            if(haystack.charAt(i)==needle.charAt(i))
            {
                ind=i;
                break;
            }
        }
        return ind;


//        or
//        int n = haystack.length();
//        int m = needle.length();
//
//        if (m == 0) return 0;
//        if (m > n) return -1;
//
//        for (int i = 0; i <= n - m; i++) {
//            if (haystack.substring(i, i + m).equals(needle)) {
//                return i;
//            }
//        }
//
//        return -1;
    }
    public static void main(String[] args) {
          String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
}
