class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int s=0,p=0;
        for(int i=0;i<n;i++){
            s=s+nums[i];
            p=p+(nums[i]*i);
        }
         int ans=p;
        for(int j=n-1; j>0; j--){
            ans = Math.max(ans, p+s-n*nums[j]);
            p = p + s - n*nums[j];
        }
        
        return ans;
    }
}