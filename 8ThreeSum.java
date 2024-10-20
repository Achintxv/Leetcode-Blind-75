/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3 || nums==null){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        for(int i=0; i<nums.length-2; i++){
            int l=i+1; int r=nums.length-1;
            while(l<r){
                int a=nums[i]+nums[l]+nums[r];
                if(a==0){
                    s.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++; r--;
                }
                else if(a>0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return new ArrayList<>(s);
    }
}
