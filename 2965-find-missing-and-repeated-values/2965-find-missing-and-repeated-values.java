class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] arr = new int[2];
        int count = 0;
        int[] hash = new int[n*n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int val = grid[i][j];
                hash[val]++;
                if(hash[val] > 1){
                    arr[0] = val;
                }
            }
        }
        for(int i=1;i<=n*n;i++){
            if(hash[i] == 0){
                arr[1] = i;
                break;
            }
        }
        
        return arr;
    }
}