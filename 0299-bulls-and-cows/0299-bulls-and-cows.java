class Solution {
    public String getHint(String secret, String guess) {
        int bull=0,cow=0;
        String ans="";
        int sf[] = new int[10];
        int gf[] = new int[10];

        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bull++;
            }
            else{
             sf[secret.charAt(i)-'0']+=1;
             gf[guess.charAt(i)-'0']+=1;
            }
        }
        for(int i=0;i<10;i++){
            cow = cow + Math.min(sf[i],gf[i]);
        }
        ans = bull+"A"+cow+"B";
        return ans;
    }
}