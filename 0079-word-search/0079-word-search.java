class Solution {
    public boolean exist(char[][] board, String word) {
        char[] arr = word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == arr[0] && exists(board, arr, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean exists(char[][] board, char[] arr, int i, int j, int idx){
        if(idx == arr.length) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] == '$' || board[i][j] != arr[idx]) return false;
        char temp = board[i][j];
        board[i][j] = '$';
        boolean res = exists(board, arr, i+1, j, idx+1) ||
        exists(board, arr, i-1, j, idx+1) ||
        exists(board, arr, i, j+1, idx+1) ||
        exists(board, arr, i, j-1, idx+1);

        board[i][j] = temp;
        return res;
    }
}