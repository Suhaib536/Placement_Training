class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int j=0;
        int[] seen = new int[128];
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(seen[c] > j){
                j=seen[c];
            }
            if (i - j + 1 > maxLength){
                maxLength = i - j + 1;
                }
            seen[c] = i + 1;
        }
        return maxLength;
    }
}
