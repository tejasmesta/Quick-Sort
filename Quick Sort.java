class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low>=high)
        {
            return;
        }
        int p = partition(arr,low,high);
        quickSort(arr,low,p-1);
        quickSort(arr,p+1,high);
    }
    
    static int partition(int arr[], int low, int high)
    {
        // your code here  
        int pivot = arr[low];
        
        int cnt = 0;
        
        for(int i=low+1;i<=high;i++)
        {
            if(arr[i]<=pivot)
            cnt++;
        }
        
        int pivotIndex = low+cnt;
        
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[low];
        arr[low] = temp;
        
        int i = low;
        int j = high;
        
        while(i<pivotIndex && j>pivotIndex)
        {
            while(arr[i]<=pivot)
                i++;
                
            while(arr[j]>pivot)
                j--;
                
            if(i<pivotIndex && j>pivotIndex)
            {
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
                i++;
                j--;
            }
        }
        
        return pivotIndex;
    } 
}

