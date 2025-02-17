class QuickSort 
{ 
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    void swap(int arr[],int i,int j){
        //Your code here   
        arr[i] = arr[i] + arr[j]; 
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    
    /* This function is same in both iterative and 
       recursive*/
    int partition(int arr[], int l, int h) 
    { 
        int pivot = array[h]; // Choosing the Last Element as Pivot

        int small = (l-1);
        for (int big = l; big<h; big++){
            
            if (arr[big] < pivot){
                small++;
                swap(arr, big, small); // All Elements Greater than Pivot should be to the Right of the Pivot's Position
            }
        }

        swap(arr, small+1, h); // Small is the last element in the rray that is less than pivot. 
                               // Swapping Small+1 Element with Pivot 
                               // to ensure all elements after pivot is greater than pivot 
                               // And all elements less that pivot is less than pivot.
        return small+1;
    }  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high) 
    {  
            // Recursively sort elements before 
            // partition and after partition 
            if (l<h) {
                int partition = partition(arr, l, h);
                QuickSort(arr, l, partition-1);
                QuickSort(arr, partition+1, h);
            }
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 
