package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class ParenthesesGenerator {
    public static List<String> generatePara(int n)
    {
        List<String> res=new ArrayList<>();
        backtrack(res,"",0,0,n);
        return res;
    }

    private static void backtrack(List<String> res, String curr, int open, int close, int max) {
        // Base case: if the current string is complete
        if(curr.length()==max*2)
        {
            res.add(curr);
            return;
        }
        // If we can still add an opening bracket
        if (open<max)
        {
            backtrack(res,curr+"(",open+1,close,max);
        }
        // If we can add a closing bracket
        if(close<open)
        {
            backtrack(res,curr+")",open,close+1,max);
        }

    }

    public static void main(String[] args) {
         int n=3;
         List<String> comb=generatePara(n);
        System.out.println(comb);
    }
}


