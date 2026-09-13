class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        
        List<int[]> ans = new ArrayList<>();
        int i =0;

        //if there is no overlapping condition then simply add sorted intervals in list
        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }

        //if there is overlap - check overlap and then take min and max 
        while(i<intervals.length && intervals[i][0] <= newInterval[1]){

            newInterval[0] = Math.min( newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max( newInterval[1] , intervals[i][1]);
            i++;
        }

        // we are getting min and max then -> merge new interval here
        ans.add(newInterval);

        //add reamaing intervals 

        while(i < intervals.length){
            ans.add(intervals[i]);
            i++;
        }
        return ans.toArray(new int [ans.size()] [] );

        
    }
}