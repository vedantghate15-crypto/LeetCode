class Solution {
    public String compressedString(String word) {
        
        String newStr = "";

        for (int i = 0; i < word.length(); i++) {

            int count = 1;

            while (i < word.length() - 1
                    && word.charAt(i) == word.charAt(i + 1)
                    && count < 9) {

                count++;
                i++;
            }

            newStr += count;
            newStr += word.charAt(i);
        }

        return newStr;
    }
}