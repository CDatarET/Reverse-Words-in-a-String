class Solution {
    public String reverseWords(String s) {
        String[] rev = s.trim().split("\\s+");
        String ret = "";
        for(int i = rev.length - 1; i >= 0; i--){
            ret = ret + " " + rev[i];
        }

        return(ret.trim());
    }
}
