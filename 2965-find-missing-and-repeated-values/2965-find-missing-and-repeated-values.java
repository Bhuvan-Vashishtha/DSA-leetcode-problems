class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] arr = new int[2];
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                count++;
                if(set.contains(grid[i][j])){
                    arr[0] = grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                }
            }
        }
        for(int i=1;i<=count;i++){
            if(!set.contains(i)){
                arr[1] = i;
                break;
            }
        }
        
        return arr;
    }
}