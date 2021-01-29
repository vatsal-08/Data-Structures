public class Power {
    public static int power(int x, int n)
    {
        
        if(n==0)
        return 1;
        int temp = power(x,n/2);
        int t = temp*temp;
        if(n%2==1)
        t*=x;
        return t;
    }
}
