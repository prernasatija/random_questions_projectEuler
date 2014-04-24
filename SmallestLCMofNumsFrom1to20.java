public class HelloWorld{
    
    public static int hcf(int m, int n)
    {
        while(n>0)
        {
            m = m % n;
            if(m==0)
            {
                return n;
            }
            else
            {
                n = n%m;
            }
        }
        return m;
    }
    
    /*public static int lcm(int m, int n)
    {
        int prod = m*n;
        int lcm = 0;
        lcm = prod/hcf(m,n);
        return lcm;
    }
*/
     public static void main(String []args){
        System.out.println("Hello World");
        
        int ans =1 ;
       for(int i=2; i<20; i++)
       {
           ans = ans* (i/hcf(ans, i));         
       }
        System.out.println(ans);
        
     }
}
