class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] lastSeenIdx = new int[128];
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            left = Math.max(left, lastSeenIdx[currentChar]);
            maxLength = Math.max(maxLength, right - left + 1);
            lastSeenIdx[currentChar] = right + 1;
        }

        return maxLength;
    }
}

    