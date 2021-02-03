import java.util.*;

public class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        while (sc.hasNext()) {
            String input = sc.next();
            char[] chars = input.toCharArray();
            for (char c : chars) {
                if (c == '[' || c == '(' || c == '{') {
                    stack.push(c);
                    continue;
                }
                if (c == ']' && !stack.empty() && stack.peek() == '[') {
                    stack.pop();
                    continue;
                }
                if (c == ')' && !stack.empty() && stack.peek() == '(') {
                    stack.pop();
                    continue;
                }
                if (c == '}' && !stack.empty() && stack.peek() == '{') {
                    stack.pop();
                    continue;
                }
                if (c == ']' || c == ')' || c == '}') {
                    stack.push(c);
                    break;
                }
            }
            System.out.println(stack.isEmpty());
            stack.clear();
        }

    }
}

