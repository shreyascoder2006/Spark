class Solution {
    
    public int find_sum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] arr) {
        int index=-1;
        int m=arr.length;
        for(int i=0;i<m;i++)
        {
           if(i== find_sum(arr[i]))
           {
              return i;  
           }
        }
        return index;
    }
    
}