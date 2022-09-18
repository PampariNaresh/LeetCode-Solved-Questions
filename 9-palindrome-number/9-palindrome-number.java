class Solution {
    public boolean isPalindrome(int x) {
        int r,reverse=0,temp;
        temp=x;
        if(x<0) {
            return false;
        }
        if(x==0) {
            return true;
        }
     while(x!=0) {
         r =x%10;
         reverse = 10*reverse +r;
         x=x/10;
     }
    if(reverse==temp) {
        return true;
    }
        return false;
    }
}