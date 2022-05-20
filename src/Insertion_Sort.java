public class Insertion_Sort {

    void print_array(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.printf(arr[i] +" ");
        }
    }

    void insertion_sort(int arr[]){
        for (int i=0; i<arr.length; i++){

            int temp = arr[i];
            int j= i-1;

            while (j>=0 && arr[j] > temp){

                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = temp;
        }
    }


    public static void main(String[] args) {

        Insertion_Sort ob = new Insertion_Sort();

        int arr[] = {45,5,45,23,26,89,51,34};
        System.out.println("Before Sorting:");
        ob.print_array(arr);
        System.out.println("\nAfter Sorting:");
        ob.insertion_sort(arr);
        ob.print_array(arr);
    }
}
