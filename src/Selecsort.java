public class Selecsort {
    public static void main(String[] args){
        int arr[]={9,1,5,7,4,6};
        System.out.println("Elements before sorting: ");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println();
        System.out.println("Elements after sorting: ");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
}
