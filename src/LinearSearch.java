public class LinearSearch {
    public static void main(String args[]) {
        int arr[] = {1, 3, 4, 6, 9};
        int tar = 6;
        int result = binSearch(arr, tar);

        if (result != -1)
            System.out.println("Element found at the index: " + result);
        else
            System.out.println("Element not found ");
    }

    public static int linSearch(int[] arr, int tar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return i;
            }
        }
        return -1;
    }
    public static int binSearch(int[] arr, int tar){
        int left=0;
        int right= arr.length-1 ;

        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==tar){
                return mid;
            }
            else if(arr[mid]<tar){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }

        return -1;
    }

}
