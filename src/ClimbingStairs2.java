public class ClimbingStairs2 {
    public static int countWays(int n){
        if(n==0)return 1;
        if(n==1)return 1;
        return countWays(n-1)+countWays(n-2);
    }
    public static void main(String[] args){
        int n=3;
        int ways=countWays(n);
        System.out.println("Number of distinct ways:"+ways);
    }
}