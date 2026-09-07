class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List <List<Integer>> res = new ArrayList<>();
        for(int a = 0; a < nums.length; a++){ //to track a
            if(a > 0 && nums[a] == nums[a-1]) continue; //skip if duplicate value
            for(int b = a + 1 ; b < nums.length; b++){ //to track b
                if( b > a + 1 && nums[b] == nums[b - 1]) continue; //skip if duplicate value
                int c = b + 1; //left pointer
                int d = nums.length - 1; //right pointer
                while(c < d){
                    long sum = (long)nums[a] + nums[b] + nums[c] + nums[d]; //calculate sum
                    if(sum == target){
                        res.add(Arrays.asList(nums[a],nums[b],nums[c],nums[d])); //add to the list if target found
                        c++; //increment the left pointer
                        d--; //decrement the right pointer
                        while(c < d && nums[c] == nums[c - 1]) c++; //skip if duplicate
                        while(c < d && nums[d] == nums[d + 1]) d--; //skip if duplicate

                    }else if(sum < target){ //if sum is smaller, move towards right
                        c++;
                    }else{ //else move towards left, smaller values
                        d--;
                    }
                }

            }
        }
        return res;
    }
}