import java.util.Stack;

class CheckParantheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CheckParantheses  solution = new CheckParantheses ();

        // Test cases
        String[] testCases = { "()", "()[]{}", "(]", "([)]", "{[]}", "{[()]}" };

        for (String testCase : testCases) {
            System.out.println("Input: " + testCase + " -> Output: " + solution.isValid(testCase));
        }
    }
}
