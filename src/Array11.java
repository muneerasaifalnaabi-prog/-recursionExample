public class Array11 {
    public int  array11(int[] nums, int index){
        //Base Case
        if ( index == nums.length){
            return 0;
        }
        //Recursive Case
        else {
            if (nums[index] == 11){
                return 1 + array11(nums, index + 1);
            }

        }


    }
}
