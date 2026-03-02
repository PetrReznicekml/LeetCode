class Solution {
    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        char [] xdd = a.toCharArray();
        boolean palindrom = false;
        String b = "";
        for (int i = xdd.length - 1; i >= 0; i--) {
            b += xdd[i];
        }
        if (a.equals(b)){
            palindrom = true;
        }
        return palindrom;
    }
}