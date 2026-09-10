class Solution {
    public int minimumDeletions(int[] arr) {
        int highest=Integer.MIN_VALUE;
        int lowest=Integer.MAX_VALUE;
        int l=0,h=0;

        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>highest) 
            {
                highest=arr[i];
                h=i;
            }
            if(arr[i]<lowest)
            {
                lowest=arr[i];
                l=i;
            }
        }
        int ans[]=new int[4];

       ans[0] = Math.max(l, h) + 1;       // both front

       ans[1] = n - Math.min(l, h);       // both back

        ans[2] = l + 1 + (n - h);          // l front, h back

        ans[3] = h + 1 + (n - l);          // h front, l back
       int min=Integer.MAX_VALUE;

       for(int i=0;i<4;i++)
       {
         if(ans[i]<min)
           {
            min=ans[i];
           }

       }
       return min;
    }
}