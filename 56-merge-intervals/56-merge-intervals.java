class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList <int[]> output = new ArrayList<>();
       // int i = 0;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        for(int i = 0; i<intervals.length-1; i++){
            if(intervals[i][1] >= intervals[i+1][0]){
                intervals[i+1][0] = intervals[i][0];
                intervals[i+1][1] = Math.max(intervals[i][1], intervals[i+1][1]);
                intervals[i] = new int[1];
            }
        }
        for(int i = 0; i<intervals.length; i++){
            if(intervals[i].length != 1){
                output.add(intervals[i]);
            }
        }
        
        
        
        return output.toArray(new int[output.size()][2]);
    }
}