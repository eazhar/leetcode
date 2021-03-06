class Solution {
    public int coinChange(int[] coins, int amount) {
        int [] numWays = new int[amount+1];
        Arrays.fill(numWays, amount+1);
        numWays[0] = 0;
        
        for(int i = 1; i<(amount+1); i++){
            for(int j : coins){
                if((i-j) >=0){
                    numWays[i] = Math.min(numWays[i], 1+numWays[i-j]);
                }
            }
        }
        
        if(numWays[amount] < amount+1){
            return numWays[amount];
        }
        else{
            return -1;
            
        }
    }
}