package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {


        public  static boolean isValid(String s) {
            Map<Character, Character> bracketMap = new HashMap<>();
            bracketMap.put(')', '(');
            bracketMap.put(']', '[');
            bracketMap.put('}', '{');

            Stack<Character> stack = new Stack<>();

            for (char ch : s.toCharArray()) {
                if (bracketMap.containsKey(ch)) {
                    // closing bracket
                    if (stack.isEmpty() || stack.pop() != bracketMap.get(ch)) {
                        return false;
                    }
                } else {
                    // opening bracket
                    stack.push(ch);
                }
            }

            return stack.isEmpty();
        }

        public static void main(String[] args) {

            System.out.println(isValid("({[]})")); // true
            System.out.println(isValid("(]"));     // false
            System.out.println(isValid("([)]"));   // false
            System.out.println(isValid("()[]{}")); // true
        }


}
