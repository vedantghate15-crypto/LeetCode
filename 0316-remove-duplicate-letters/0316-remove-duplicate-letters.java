class Solution {
    public String removeDuplicateLetters(String s) {
    int freq[] = new int[26];
        boolean map[] = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            freq[currChar - 'a']--;
            if (map[currChar - 'a']) {
                continue;
            }
            while (newStr.length() > 0 &&
                   newStr.charAt(newStr.length() - 1) > currChar &&
                   freq[newStr.charAt(newStr.length() - 1) - 'a'] > 0) {
                char removed = newStr.charAt(newStr.length() - 1);
                map[removed - 'a'] = false;
                newStr.deleteCharAt(newStr.length() - 1);
            }
            newStr.append(currChar);
            map[currChar - 'a'] = true;
        }
        return newStr.toString();
    }
}