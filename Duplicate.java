/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> h = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!h.contains(nums[i])){
                h.add(nums[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
