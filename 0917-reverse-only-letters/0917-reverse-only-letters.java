class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder("");
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<n && j>=0){
            char l = s.charAt(i);
            char r = s.charAt(j);
            if(!Character.isLetter(l)){
                sb.append(l);
                i++;
            }
            else if(!Character.isLetter(r)){
                j--;
            }
            else{
                sb.append(r);
                i++;
                j--;
            }
        }
        while(i<n){
            if(!Character.isLetter(s.charAt(i))){
            sb.append(s.charAt(i));
            i++;
            }
            else{
                break;
            }
        }
        while(j>=0){
            if(Character.isLetter(s.charAt(j))){
               sb.append(s.charAt(j));
               j--;
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}