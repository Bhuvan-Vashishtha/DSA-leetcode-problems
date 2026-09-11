class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int[] freq = new int[256];
        int maxLen = 0;
        while(r<n){
            char rc =s.charAt(r);
            freq[rc]++;
            if(freq[rc]>1){
                while(freq[rc] != 1){
                    char lc = s.charAt(l);
                    freq[lc]--;
                    l++;
                }
            }
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}