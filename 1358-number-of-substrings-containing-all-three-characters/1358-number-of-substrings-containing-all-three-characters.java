class Solution {
    public int numberOfSubstrings(String s) {
       int trace[] = new int[3];
        int left=0,ans=0;
        for(int i=0;i<s.length();i++){
            trace[s.charAt(i)-'a']++;
            while(trace[0]>0 && trace[1]>0 && trace[2]>0){
                ans = ans + s.length()-i;
                trace[s.charAt(left++)-'a']--;
            }
        }
        return ans;
    }
}