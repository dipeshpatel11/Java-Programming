// write bubble sort
public class bubbleSort {

        // An optimized version of Bubble Sort 
        public static void bubblesort(int arr[], int n) 
        { 
            int i, j, temp; 
            boolean swapped; 
            for (i = 0; i < n - 1; i++) { 
                swapped = false; 
                for (j = 0; j < n - i - 1; j++) { 
                    if (arr[j] > arr[j + 1]) { 
                        // swap arr[j] and arr[j+1] 
                        temp = arr[j]; 
                        arr[j] = arr[j + 1]; 
                        arr[j + 1] = temp; 
                        swapped = true; 
                    } 
                } 
    
                // IF no two elements were  
                // swapped by inner loop, then break 
                if (swapped == false) 
                    break; 
            }
            for(int z=0; z<n-1;z++){
                System.out.println(arr[z]);

            }
        }

        public static void main(String[] args) {
            
            int [] arr = {6,4,7,2,9,2,0,1,4,8};
            int arr_length = arr.length;
            bubblesort(arr,arr_length);
        }
    
}