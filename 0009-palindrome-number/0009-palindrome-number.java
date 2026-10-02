class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        return original == reverse;
    }
    public static void main(String args[]) {
        int x = 121;
        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(x));
    }
}