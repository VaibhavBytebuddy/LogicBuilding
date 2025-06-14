package arrays;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.TreeSet;

public class SecLargest {

    private static int secLarge(int[] arr) {

        TreeSet<Integer> ts=new TreeSet<>();
        for(int i=0;i<arr.length;i++)
        {
            ts.add(arr[i]);
        }
        Iterator itr=ts.iterator();
        int i=0;
        while (itr.hasNext())
        {
            arr[i]=(int)itr.next();
            i++;
        }

        return arr[arr.length-2];
    }

    public static void main(String[] args) {
        int[] arr={1,42,2,53,53,53,51,23};

        System.out.println(secLarge(arr));
    }


}
