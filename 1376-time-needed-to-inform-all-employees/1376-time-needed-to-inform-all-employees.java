class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map <Integer, ArrayList<Integer>> map = new HashMap<>();
        
        //first convert management hierarchy into adjacency list
        for(int i = 0; i<manager.length; i++){
            if(manager[i] != -1){
                if(map.containsKey(manager[i])){
                    ArrayList <Integer> a = map.get(manager[i]);
                    a.add(i);
                    map.put(manager[i],a);
                }else{
                    ArrayList <Integer> a = new ArrayList<>();
                    a.add(i);
                    map.put(manager[i],a);
                }
                
            }
        }
        return dfs(headID,map,informTime);
    }
    
    public int dfs(int currentID, Map <Integer, ArrayList<Integer>> map, int[] informTime){
        if(map.get(currentID) == null){
            return 0;
        }
        int max = 0;
        ArrayList <Integer> subordinates = map.get(currentID);
        for(int i = 0; i<subordinates.size(); i++){
            max = Math.max(max,dfs(subordinates.get(i),map,informTime));
        }
        return max+informTime[currentID];
    }
}