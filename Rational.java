package Assignment4;

/*
Assignment4 
Author: 15331436 | Diarmuid Beirne

09 Oct 2017
*/

public class Rational {

    private int p;
    private int q;

    public Rational(int p, int q) {
        this.p = p;
        this.q = q;
    }

    public static Rational add(Rational a, Rational b){
        int top;
        int bottom;

        bottom = a.q * b.q; //multiply the two divisiors

        top = (a.p * (bottom/a.q) + (b.p * (bottom/b.q)));
        // System.out.println("\n" + top + " / " + bottom);
        return (new Rational(top,bottom));

    }

    public static Rational subtract(Rational a, Rational b) {

        int top;
        int bottom;

        bottom = a.q * b.q; //multiply the two divisiors

        top = (a.p * (bottom/a.q) - (b.p * (bottom/b.q)));
        //System.out.println("\n" + top + " / " + bottom);
        return (new Rational(top,bottom));
    }


    public static Rational multiply(Rational a, Rational b) {
        int top;
        int bottom;

        bottom = a.q * b.q; //multiply the two divisiors

        top = a.p * b.p;

        Rational answer = Simplify((new Rational(top,bottom)));
        return answer;

    }

    private static Rational Simplify(Rational r) {
        int GCD = getGCD(r.p, r.q); //GREATEST COMMON DIVISOR
        return (new Rational((r.p/GCD), r.q/GCD));
    }

    public static int getGCD(int a, int b){
        if (b==0) return a;
        return getGCD(b,a%b);
    }

    public static Rational divide(Rational a, Rational b) {
        int top;
        int bottom;

        top = a.p * b.q;
        bottom = a.q * b.p;
        return (new Rational(top,bottom));


    }

    public String toString(){
        return this.p + "/" + this.q;
    }


    public String toStringSimplfied(){
        Rational simplfiedVersion;
        simplfiedVersion = Simplify(this);
        return simplfiedVersion.p + "/" + simplfiedVersion.q;
    }


    public String toStringDecimal()
    {
        float dec = (float) this.p / this.q;
        return String.valueOf(dec);
    }
}
