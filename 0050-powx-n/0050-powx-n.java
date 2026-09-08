class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            n = -n;
            x = 1/x;
        }
        return pow(x, n);
    }
    static double pow(double x, int n){
        if(n == 0) return 1.0;

        double ans = pow(x, n/2);
        if(n% 2 == 0){
            return ans*ans;
        }
        else{
            return ans*ans*x;
        }
    }
}