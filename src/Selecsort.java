public class Selecsort {
    public static void main(String[] args){
        int nums[]={9,1,5,7,4,6};
        int minIndex=-1;
        int temp=0;
        System.out.println("Elements before sorting: ");
        for(int num:nums)
        {
            System.out.print(num+" ");
        }
        for(int i=0;i< nums.length-1;i++)
        {
            minIndex=i;
            for (int j=i+1;j< nums.length;j++)
            {
                if(nums[minIndex]>nums[j])
                {
                    minIndex=j;
                }
            }
            temp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;
        }
        System.out.println();
        System.out.println("Elements after sorting: ");
        for(int num:nums)
        {
            System.out.print(num+" ");
        }
    }
}
