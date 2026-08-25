class Solution {
    public String addSpaces(String s, int[] spaces) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int m = spaces.length;
        StringBuilder sb = new StringBuilder();
        while(i<n && j<m){
            char ch = s.charAt(i);
            if(i == spaces[j]){
                sb.append(" ");
                j++;
            }
            else{
                sb.append(ch);
                i++;
            }
        }
        sb.append(s.substring(spaces[m-1]));
        return sb.toString();
    }
}