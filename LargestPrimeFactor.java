import java.util.Arrays;
public class largestprimefactor {

    /**
	 * @param args
	 */
	public static void main(String[] args) {
		double n = 600851475143l;

        int i=3;
        double highest=0;
        double s=Math.sqrt(n);
        while(n%2==0){
            n=n/2;
        }
        while(n>1 && i <s){
            if(n%i==0)
            {
                n=n/i;
                highest = n;
                s = Math.sqrt(n);
            }
            else
            {
                i = i+2;
            }
        }
System.out.println("hi");
        System.out.println(highest);
}
	}
        