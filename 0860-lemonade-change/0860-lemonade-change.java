class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five=0,ten=0,twenty=0;
        
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                five++;
            }
            else if(bills[i]==10)
            {
                if(five>0)
                {
                    five--;
                    ten++;
                }
                else
                    return false;
            }
            else
            {
                if(five>=1 && ten>=1)
                {
                    twenty++;
                    five--;
                    ten--;
                }
                else if(five>=3)
                {
                    twenty++;
                    five-=3;
                }
                else
                    return false;
            }
        }
        
        return true;
    }
}