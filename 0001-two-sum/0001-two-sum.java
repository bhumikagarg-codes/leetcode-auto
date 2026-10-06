class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] arr = new int[2];

        // for (int i = 0;i<nums.length;i++){
        //     for (int j = i+1;j<nums.length;j++){
        //         if (nums[i] + nums[j] == target) {
        //             arr[0] = i;
        //             arr[1] = j;
        //         }
        //     }
        // }
        // return arr;
        
        // if array is sorted
        // int[] arr = new int[2];
        // int i = 0;
        // int j = nums.length-1;
        // int sum = 0;

        //     while(i < j){
        //     sum = nums[i] + nums[j];
        //        if (sum < target){
        //           i++;
        //        }
        //        else if (sum > target){
        //            j--;
        //        }
        //        else {
        //         arr[0] = i;
        //         arr[1] = j;
        //         break;
        //        }
        // }
        // return arr;

        // Hashmap approach
        int[] arr = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0;i<nums.length;i++){
            if (map.containsKey(target - nums[i])){
                arr[0] = map.get(target - nums[i]);
                arr[1] = i;
            }
            else{
                map.put(nums[i],i);
            }
        }

        return arr;
    }
}