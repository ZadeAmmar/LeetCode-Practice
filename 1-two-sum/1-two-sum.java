class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int sum;
        int[] numbers = new int[2];
        
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 1; j < nums.length; j++)
            {
                sum = nums[i] + nums[j];
                
                if(i != j)
                {
                   if(sum == target)
                   {
                        numbers[0] = i; 
                        numbers[1] = j;
                        break;
                   } 
                }
                
            }
        }
        
        return numbers;
    }
}