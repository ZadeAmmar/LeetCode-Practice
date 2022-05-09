class Solution 
{
    public boolean isPalindrome(int x) 
    {
        String strNum = Integer.toString(x), space = "";
        char current;
        String backwards = "";
        boolean palin = false;
        
        for(int i = strNum.length()-1; i >= 0; i--)
        {
            current = strNum.charAt(i);
            backwards += current + space;
        }
        
        if(strNum.equalsIgnoreCase(backwards))
        {
            return true;
        }
        
        else return false;
    }
}