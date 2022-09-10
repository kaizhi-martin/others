//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//No duplicate element, you may not use the same element twice.
//You can return the answer in any order.
//If there is no such pair, return an empty array.
//
//Input: nums = [2,11,7,15], target = 9
//Output: [0,2]


import java.util.ArrayList;
import java.util.List;

public class Interview {


    //    public int[] method(int[] nums, int target) {
//        int one = 0;
//        int two = 0;
//        boolean found = false;
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int k = i + 1; k < nums.length; k++) {
//                int sum = nums[i] + nums[k];
//                if (sum == target) {
//                    one = i;
//                    two = k;
//                    found = true;
//                    break;
//                }
//            }
//            if(found){
//                break;
//            }
//
//        }
//        if(one == 0 && two == 0 ){
//            int[] res1 = new int[0];
//            return res1;
//        }else {
//            int[] res = new int[2];
//            res[0] = one;
//            res[1] = two;
//            return res;
//        }
//    }
    public int[] method(int[] nums, int target) {
        List<Integer> numList = new ArrayList<Integer>();
        int one = 0;
        int two = 0;
        for (int num : nums) {
            numList.add(num);
        }
        for (int num : nums) {
            if (numList.contains(target - num)) {
                one = numList.indexOf(num);
                two = numList.indexOf(target - num);
                break;
            }
        }
        if (one == 0 && two == 0) {

            int[] res = new int[0];
            return res;
        } else {
            int[] res = new int[2];
            res[0] = one;
            res[1] = two;
            return res;

        }

    }


    public static void main(String[] args) {
        Interview interview = new Interview();
        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 11;
        nums[2] = 7;
        nums[3] = 5;
        int[] re = interview.method(nums, 9);
//        System.out.println(re.length);
//        System.out.println(re[0]);
//        System.out.println(re[1]);

    }


}
