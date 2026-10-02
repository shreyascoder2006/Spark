import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, int openCount, int closeCount, int max) {
        // Base case: length reaches 2 * n
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }

        // Add an open parenthesis if count is less than n
        if (openCount < max) {
            current.append('(');
            backtrack(result, current, openCount + 1, closeCount, max);
            current.deleteCharAt(current.length() - 1); // backtrack
        }

        // Add a close parenthesis only if it doesn't exceed open parentheses
        if (closeCount < openCount) {
            current.append(')');
            backtrack(result, current, openCount, closeCount + 1, max);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}