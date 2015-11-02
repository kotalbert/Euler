
public class Problem9 {
    final int T = 1000;
    int a;
    int b;
    int c;
    
    
    private boolean isPythagorean() {
        if (a*a+b*b==c*c) return true;
        return false;
    }

    private void shift() {
        c=T-a-b;
    }

    public void solve() {
        
        // starting point
        a = 1;
        b = 2;
        c=T-a-b;

        while (!isPythagorean()) {

            b++;
            shift();
            if (c<3) {

                a++;
                b=a+1;
                shift();

            }
        }

        System.out.println(a+" "+b+" "+c);
        System.out.println("Product: " + a*b*c);
    }

}
