class Solution {
public:
    int trap(vector<int>& height) { 
        int n = height.size(); 
        int left =0 , right = n-1; 
        int leftmax = 0 , rightmax =0 ; 
        int total =0 ;

        while(left<right){
            // left porttion 
            if(height[left]<= height[right]) {
                if(height[left]<leftmax){
                    total += leftmax - height[left]; 
                }
                else leftmax = height[left];
                left = left+1 ; 
            }
            // right portion
           else{
            if(height[right]<rightmax) {
                total += rightmax - height[right];
            }
            else {
                rightmax = height[right];
            }
                right = right -1; 
           } 
        }
        
        return total ; 
        
    }
};