class Solution {
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();

        Deque<StringBuilder> stringStack = new ArrayDeque<>();

        StringBuilder currentString = new StringBuilder();

        int currentNum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(currentNum);
                stringStack.push(currentString);
                currentNum = 0;
                currentString = new StringBuilder();
            } else if (c == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder decodedBlock = currentString;
                
                currentString = stringStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    currentString.append(decodedBlock);
                }
            } else {
                currentString.append(c);
            }
        }

        return currentString.toString();
    }
}

    