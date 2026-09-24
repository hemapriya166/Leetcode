class Solution {
    public boolean isValid(String s) {
        int top = -1;
        char ch[] = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                top++;
                ch[top] = s.charAt(i);
            }

            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {

                if (top == -1) {
                    return false;
                }

                if ((s.charAt(i) == ')' && ch[top] == '(') ||
                    (s.charAt(i) == ']' && ch[top] == '[') ||
                    (s.charAt(i) == '}' && ch[top] == '{')) {

                    top--;
                } else {
                    return false;
                }
            }
        }

        return top == -1;
    }
}
