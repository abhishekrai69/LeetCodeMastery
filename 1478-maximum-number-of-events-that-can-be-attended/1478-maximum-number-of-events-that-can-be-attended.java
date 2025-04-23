class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a,b)->a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int idx = 0, meetingCount = 0, day = 1, n = events.length;
        while(day<=100000){
            while(!pq.isEmpty() && pq.peek() < day){
                pq.remove();
            }
            while(idx<n && events[idx][0]==day){
                pq.add(events[idx][1]);
                idx++;
            }
            if(!pq.isEmpty()){
                pq.remove();
                meetingCount++;
            }
            day++;
        }
        return meetingCount;
    }
}