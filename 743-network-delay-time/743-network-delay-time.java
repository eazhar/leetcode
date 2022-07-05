class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        int finalDelay = 0;
        
         //using Djkstra's algorithm with a minHeap
         
        //Step 1: create adjacency List
        Map <Integer, ArrayList<int[]>> graph = new HashMap<>();
        for(int [] time: times){
            int source = time[0];
            int destination = time[1];
            int weight = time[2];
            
            if(!graph.containsKey(source)){
                graph.put(source, new ArrayList<int[]>());
            }
            ArrayList <int[]> a = graph.get(source);
            a.add(new int[]{destination,weight});
            graph.put(source,a);
        }
        
        //step 2: define minHeap, set starting node to have 0 travel time
        //note a-b means sort in ascending order
        //index [1] means use the second element (i.e. weight) as the variable to sort by
        Queue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        minHeap.add(new int[]{k,0}); //node k starts with 0 travel time
        
        //Step 3: Define HashSet to track visited nodes
        Set <Integer> visited = new HashSet<>();
        
        //Step 4: Execute BFS on minheap
        while(!minHeap.isEmpty()){
            int [] top = minHeap.poll();
            int currentSrc = top[0];
            int currentWeight = top[1];
            
            if(visited.contains(currentSrc)){
                //do nothing
            }
            else{
                finalDelay = currentWeight;
                visited.add(currentSrc);
                
                if(!graph.containsKey(currentSrc)){
                    //do nothing
                }
                else{
                    for(int [] edge : graph.get(currentSrc)){
                        int currentTarget = edge[0];
                        int currentTargetWeight = edge[1];
                        minHeap.add(new int[]{currentTarget, currentWeight+currentTargetWeight});
                    }
                }
            }
        }        
        
        
        if(visited.size() == n){
            return finalDelay;
        }else{
            return -1;
        }
    }
}