//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        int len1 = str1.length();
        int len2 = str2.length();
        
        if(len1 != len2)
        return false;
        
        Map<Character,Character> map = new HashMap<>();
        
        for(int i=0;i<len1;i++){
            if(map.containsKey(str1.charAt(i)))
            {
                if(map.get(str1.charAt(i)) != str2.charAt(i))
                return false;
            }
            else if(map.containsValue(str2.charAt(i)))
            return false;
            else
            map.put(str1.charAt(i),str2.charAt(i));
        }
        return true;
    }
}