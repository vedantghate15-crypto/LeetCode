import java.util.*;

class Solution {

    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                String first = a + b;
                String second = b + a;
                return second.compareTo(first);
            }
        });
        if (arr[0].equals("0")) {
            return "0";
        }
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        return result;
    }
}