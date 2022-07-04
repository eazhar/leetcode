class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        //first convert prequisites into indegree array
        Map <Integer, Integer> inDegree = new HashMap<>();
        
        for(int i = 0; i<prerequisites.length; i++){
            // for(int j = 0; j<prerequisites[i].length; j++){
            if(inDegree.containsKey(prerequisites[i][0])){
                int temp = inDegree.get(prerequisites[i][0]);
                temp++;
                inDegree.put(prerequisites[i][0],temp);
            }
            else{
                inDegree.put(prerequisites[i][0],1);
            }
            // }
        }
            
        //create adjacency matrix
        Map <Integer, ArrayList<Integer>> adjList = new HashMap<>();
        for(int i = 0; i<prerequisites.length; i++){
            // for(int j = 0; j<prerequisites[i].length; j++){
            if(adjList.containsKey(prerequisites[i][1])){
                ArrayList<Integer> a = adjList.get(prerequisites[i][1]);
                a.add(prerequisites[i][0]);
                adjList.put(prerequisites[i][1],a);
            }
            else{
                ArrayList<Integer> a = new ArrayList<>();
                a.add(prerequisites[i][0]);
                adjList.put(prerequisites[i][1],a);
            }
            // }
        }
        
        //now fill out the rest of the inDegree and adjList with blanks
        for(int i = 0; i<numCourses; i++){
            if(!inDegree.containsKey(i)){
                inDegree.put(i,0);
            }
            if(!adjList.containsKey(i)){
                adjList.put(i,new ArrayList());
            }
        }
        
        Stack <Integer> s = new Stack<>();
        
        for(Map.Entry <Integer, Integer> val : inDegree.entrySet()){
            if(val.getValue() == 0){
                s.push(val.getKey());
            }
        }
        
        int count = 0;
        System.out.println(inDegree);
        System.out.println(adjList);
        System.out.println(s);
        
        while(!s.isEmpty()){
            int current = s.pop();
            count++;
            ArrayList<Integer> adj = adjList.get(current);
            
            
            
            for(int i:adj){
                int currentIndegree = inDegree.get(i) - 1;
                inDegree.put(i,currentIndegree);
                if(inDegree.get(i) == 0){
                    s.push(i);
                }
            }
        }
        
        System.out.println(count);
        // System.out.println(adjList);
        
        
        return count == numCourses;
        
    }
}