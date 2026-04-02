public class AllOcc {

    public static void AllOccurance(int arr[], int key, int i) {

        if(i == arr.length) {
            return;
        }

        if(arr[i] == key) {
            System.out.print(i+" ");
        }

        AllOccurance(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 2};

        AllOccurance(arr, 2, 0);
    }
}