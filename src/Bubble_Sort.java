public class Bubble_Sort{
    int temp;
    boolean swapped;

    void bubble_sort(int arr[]){
        for (int i=0; i< arr.length-1; i++){
            swapped = false;
            for (int j=0; j< arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    void print_array(int arr[]){

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Bubble_Sort ob = new Bubble_Sort();

        int arr[] = {4,5,8,45,4,46,898,12,31};

        System.out.println("Before sorting:");
        ob.print_array(arr);
        System.out.println("\nAfter sorting:");
        ob.bubble_sort(arr);
        ob.print_array(arr);


    }
}
