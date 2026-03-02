class Solution {
    public int reverse(int x) {
        String a = String.valueOf(x);
        char [] xdd = a.toCharArray();
        String b = "";
        if (x >= 0) {
            for (int i = xdd.length - 1; i >= 0; i--) {
                b += xdd[i];
            }
        }
        else {
            b = "-";
            for (int i = xdd.length - 1; i > 0; i--) {
                b += xdd[i];
            }
        }
        try {
            x = Integer.parseInt(b);
        }
        catch (NumberFormatException e){
            x = 0;
        }
        return x;
    }
}