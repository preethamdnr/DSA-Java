public class Bubsort {
    public static void main(String[] args){
        int nums[]={9,2,4,7,8,1};
        int temp=0;
        for(int num:nums)
            System.out.println("before sorting: "+ num+" ");

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-i-1;j++)
            {
                if(nums[j]>nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for(int num:nums)
            System.out.println("after sorting: "+ num);
    }
}
