public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        int low = 0;
        int high = arr.length;
        int mid;
        int searchKey=12;
        while(low <= high )
        {    mid = (low + high ) / 2;
            if(arr[mid]==searchKey)
                System.out.println("foundet");
            if(arr[mid] < searchKey)
                low = mid + 1;
            else
                high = mid - 1;
        }
    }
}

