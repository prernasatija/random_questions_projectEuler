public class HelloWorld{
    
    public static boolean checkpalin(int num)
    {
        int rev = 0;
        int ldigit= 0;
        int n=num;
        while(n>0)
        {
            ldigit = n%10;
            rev = rev*10 + ldigit;
            n = n/10;
        }
        if(num==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     public static void main(String []args){
        System.out.println("Hello World");
        int largestpalin = 0;
        int prod=0;
        
        for(int i=999; i>100; i--)
        {
            for(int j=999; j>100; j--)
            {
              prod =i*j;
                if(checkpalin(prod))
                {
                    if(prod> largestpalin)
                    {
                        largestpalin = prod;
                    }
                }
            }
        }
         System.out.println(largestpalin);
     }
}
