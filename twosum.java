class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int sum;
        int[] result = new int[nums.length+1];
        for (int i=0; i < nums.length; i++)
        {
            for (int j=i+1; j< nums.length; j++)
            {
                if (nums[i]+nums[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        Solution s = new Solution();
        int[] nums ={2,7,11,15};
        int target = 100;

        int[] i =  s.twoSum (nums,target);
        if (i != null) {
            System.out.println("Indices are: [" + i[0] + ", " + i[1] + "]");
        } else {
            System.out.println("No pair found.");
        }
    }
}
