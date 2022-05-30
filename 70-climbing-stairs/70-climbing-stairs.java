class Solution {
    public int climbStairs(int n) {
        int [] numWays = new int[n+1];
        numWays[0] = 1;
        
        for(int i = 1; i<(n+1); i++){
            int nWaysCum = 0;
            for(int j = 1; j<=2; j++){
                //System.out.println(i-j);
                if((i-j) >=0){
                    nWaysCum += numWays[i-j];
                }
            }
            //System.out.println(nWaysCum);
            numWays[i] = nWaysCum;
        }
        return numWays[n];
    }
}