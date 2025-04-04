class Solution {
    public int[] twoSum(int[] nums, int target) {
        int testInt = -2;
        int test1Ind = -2;
        int test2Ind = -2;
        int resT = -2;
        int[] resA = {0,0};

        for (int i=0; i < nums.length; i++) {
            test1Ind = nums[i];
            for (int x=0; x < nums.length; x++) {
                test2Ind = nums[x];

                testInt = i + x;

                if ( (i != x) && testInt == target ) {

                        resA[0] = test1Ind;
                        resA[1] = test2Ind;

                        return resA;
                }
            }
        }
    return resA;
    }
}
