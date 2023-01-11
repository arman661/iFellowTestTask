package task;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        System.out.println(findValidBrackets("(()"));
    }

    public static String findValidBrackets(String s) {
        int validBracketsCount = 0;
        StringBuilder validBrackets = new StringBuilder();
        char[] chars = s.toCharArray();
        Deque<CharPosition> stack = new ArrayDeque<>();
        for (char ch : chars) {
            if (ch == '(') {
                CharPosition charPosition = new CharPosition(validBrackets.length(), ch);
                stack.push(charPosition);
                validBrackets.append(ch);
            } else if (!stack.isEmpty() && ch == ')' && stack.peek().getCh() == '(') {
                stack.pop();
                validBracketsCount += 2;
                validBrackets.append(ch);
            }
        }
        while (!stack.isEmpty()) {
            CharPosition c = stack.pop();
            validBrackets.replace(c.getIndex(), c.getIndex() + 1, "");
        }
        if (validBracketsCount > 0) {
            return validBracketsCount + " - " + validBrackets;
        }
        return Integer.toString(validBracketsCount);
    }
}
