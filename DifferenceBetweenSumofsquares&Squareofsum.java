public class HelloWorld{
    
    public static void main(String [] args)
    {
    
    int sumofsqrs = 0;
    
    int n=100;
    
    sumofsqrs = (n*(n+1)*((2*n) +1))/6;
    
    int sqrofsum = 0;
    sqrofsum = n*(n+1)/2;
    System.out.println((sqrofsum*sqrofsum)-sumofsqrs);
    
}
}