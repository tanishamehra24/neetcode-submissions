class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //initialize the res list
        List<List<Integer>> res = new ArrayList<>();
        //sort the array
        Arrays.sort(nums);
        //loop through the array once
        for(int i = 0; i < nums.length ; i ++){
            //skip if duplicate triplets
            if(nums[i] > 0) break;
            if( i > 0 && nums[i] == nums[i - 1]) continue;
            //initialize two pointers
            int j = i + 1;
            int k = nums.length - 1;
            int target = -nums[i];
            while(j < k){    
                if ( nums[j] + nums[k] == target){
                   res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                   j++;
                   k--;
                   while (j < k && nums[j] == nums[j - 1]) j++;
                   while (j < k && nums[k] == nums[k + 1]) k--;
            }else if ( nums[j] + nums[k] > target){
                k--;
            }else{
                j++;
            }
        }
}
        return res; 
    }
}
