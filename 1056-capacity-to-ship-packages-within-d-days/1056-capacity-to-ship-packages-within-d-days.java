class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;

        // Find lower and upper bounds for binary search
        for (int w : weights) {
            left = Math.max(left, w); 
            right += w;               
        }

        // Binary search
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, days, mid)) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        return left;
    }

    // Check if we can ship all packages within 'days' using capacity 'cap'
    private boolean canShip(int[] weights, int days, int cap) {
        int dayCount = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > cap) {
                dayCount++;      // need a new day
                currentLoad = 0; // reset load
            }
            currentLoad += w;
        }
        return dayCount <= days;
    }
}
