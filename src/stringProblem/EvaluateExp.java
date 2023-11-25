package src.stringProblem;
import java.util.Stack;

public class EvaluateExp {
    public static void main(String[] args) {
        String [] exp = new String [] {"4", "5", "+", "2", "*"};
        String operator = "+-/*";
        Stack<String> stack = new Stack<>();
        for (String t : exp) {
            if(!operator.contains(t)) {
                stack.push(t);
            }
            else {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                int index = operator.indexOf(t);

                switch (index) {
                    case 0:
                        stack.push(String.valueOf(a + b));
                        break;
                    case 1:
                        stack.push(String.valueOf(a - b));
                        break;
                    case 2:
                        stack.push(String.valueOf(a / b));
                        break;
                    case 3:
                        stack.push(String.valueOf(a * b));
                        break;
                }
            }
        }
        int res = Integer.parseInt(stack.pop());
        System.out.println("expValue : " + res);
    }
}

