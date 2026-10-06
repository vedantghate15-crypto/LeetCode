class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int fmn1=fib(n-1);
        int fmn2=fib(n-2);
        int fn =fmn1 +fmn2;
        return fn;
    }
    public static void main (String args[]){
        int n=6;
        Solution obj =new Solution ();
        System.out.println(obj.fib(n));
    }
}