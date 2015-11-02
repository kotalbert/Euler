
public class Problem10 {
    private boolean isPrime(long n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(long i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;

    }

    public long solve(long limit) {

        long sum = 2;

        for (long i=3;i<limit;i += 2) {
            if (isPrime(i)) sum += i;

        }

        return sum;
    }

}
