//YOUR CODE HERE

public class APLine{

    private int a, b;
    public int c;

    public APLine(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSlope(){
        double slope = (double)-a/b; //previous: double slope = -a/b;
        return slope;
    }

    public boolean isOnLine(int x, int y){
        int calc = (a*x) + (b*y) + (c); //previous: int calc = (a(x)) + (b(y)) + (c);
        if (calc == 0)
            return true;
        else
            return false;
    }
}