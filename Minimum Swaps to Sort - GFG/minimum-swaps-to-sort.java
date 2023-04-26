//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int arr[])
    {
        // Code here
        	Map<Integer,Integer> map = new HashMap<>();
		int nums[] = new int[arr.length];
		for(int i=0;i<nums.length;i++){
			nums[i]=arr[i];
		}
		int count=0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++){
			map.put(nums[i],i);
		}

		for(int i=0;i<arr.length;i++){
			while(nums[i]!=arr[i]){
				count++;
				swap(i,map.get(arr[i]),arr);
			}
		}
	return count;
	}

	public static void swap(int a,int b,int arr[]){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		}
}