package main.com.jse.lect07;

public class DSAPackages {
    public static void minmax(int[] nums){
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        if(nums.length == 0){
            System.out.println("Null Array");
            System.out.println("Null Array");
        }
        else{
            for(int num:nums){
                if(min>num)
                    min = num;
                if(max<num){
                    max = num;
                }
            }
            System.out.println("Max value of the Array is:"+max);
            System.out.println("Min value of the Array is:"+min);
        }


    }
    public static void reverseArray(int[] nums){
        int low = 0, high = nums.length-1;
        while(low < high){
            int temp = nums[low];
            nums[low++] = nums[high];
            nums[high--] = temp;
        }

        System.out.println("Reversed Array:");
        for(int num:nums){
            System.out.println(num);
        }
    }
    public static void reverseRotatedArray(int[] nums, int low, int high){
        while(low < high){
            int temp = nums[low];
            nums[low++] = nums[high];
            nums[high--] = temp;
        }
    }
    public static void rotateArray(int[] nums, int x) {
        x %= nums.length;
        reverseRotatedArray(nums,0,x-1);
        reverseRotatedArray(nums,x,nums.length-1);
        reverseRotatedArray(nums,0,nums.length-1);

        System.out.println("Rotated Array:");
        for(int num:nums){
            System.out.println(num);
        }
    }
    public static void main(String ...args){
        int[] nums = new int[]{2,4,1,30,24,6,123,23};
        minmax(nums);
        reverseArray(nums);

        int[] numsToRotate = new int[]{2,4,1,30,24,6,123,23};
        rotateArray(numsToRotate,3);

    }
}