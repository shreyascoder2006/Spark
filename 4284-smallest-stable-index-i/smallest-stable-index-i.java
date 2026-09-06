class Solution {
    public int firstStableIndex(int[] arr, int k)
    {
        int n=arr.length,max,min,diff;
        for(int i=0;i<n;i++)
        {
            max=find_max(arr,0,i);
            min=find_min(arr,i,n-1);
            diff=max-min;
            if (diff<=k)
            {
                return i;
            }
        }
        return -1;
        
    }
    public int find_max(int arr[],int s,int e)
    {
        int largest=Integer.MIN_VALUE;
       for(int i=s;i<=e;i++)
       {
        if(arr[i]>largest)
         {
            largest=arr[i];
         }
       }
       return largest;
    }

    public int find_min(int arr[],int s,int e)
      {
        int smallest=Integer.MAX_VALUE;
       for(int i=s;i<=e;i++)
       {
        if(arr[i]<smallest)
         {
            smallest=arr[i];
         }
       }
       return smallest;
    }
}