public class Selection_Sort {

    void print_array(int arr[]){
        for (int i=0; i<arr.length; i++)
        {
            System.out.printf( arr[i] +" ");
        }
    }

    void selection_sort(int arr[]){
        for (int i=0; i<arr.length-1; i++)
        {
            int min = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min!=i){
                int temp = arr[i];
                arr[i] = min;
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {

        Selection_Sort ob = new Selection_Sort();

        int arr[] = {45,65,1,89,31,752,23};

        System.out.println("Before Sorting: ");
        ob.print_array(arr);
        System.out.println("\nAfter Sorting: ");
        ob.selection_sort(arr);
        ob.print_array(arr);


    }
}
