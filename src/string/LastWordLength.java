package string;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.InputStream;

public class LastWordLength  {

    public static  int lengthOfLastWord(String s)  {
           int len=0;
           int i=s.length()-1;
     

        // Skip trailing spaces  last la space astil trr , te remove karnya sathi
           while(i>=0 && s.charAt(i)==' ')
           {
               i--;
           }
           while (i>=0 && s.charAt(i)!=' ')
           {
               len++;
               i--;
           }

           return len;

    }

    public static void main(String[] args) {
           String s="Hello World";



           int len=lengthOfLastWord(s);
        System.out.println("Last word length is "+ len);
    }
}
