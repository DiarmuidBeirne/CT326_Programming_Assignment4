package Assignment4;

/*
Assignment4 
Author: 15331436 | Diarmuid Beirne

09 Oct 2017
*/

public class main {

    public static void main(String args[])
    {
        for (Ball b : Ball.values()){

            System.out.printf("%s\t\t\t %d g\t %d mm\n",b,b.getWeight(),b.getDiameter());
        }

        System.out.printf("The circumfrence of a golf ball is %.2f mm\n",Ball.GOLF.getCircumference());
        System.out.printf("The volume of a baseball is %.2f mm^3",Ball.BASEBALL.getVolume());

        //PART 3 + 4
        Rational r1 = new Rational(Ball.BASEBALL.getWeight(), Ball.BASKETBALL.getWeight());
        Rational r2 = new Rational(Ball.FOOTBALL.getWeight(), Ball.GOLF.getWeight());
        Rational r3 = new Rational(Ball.POOL.getDiameter(), Ball.SOFTBALL.getDiameter());
        Rational r4 = new Rational(Ball.TENNIS.getDiameter(), Ball.VOLLEYBALL.getDiameter());


        System.out.println("\n\n\n -----Part 4------\n\n");

        Rational test1 = new Rational(15,40);

        System.out.println(test1.toString()+ " = " + test1.toStringSimplfied() + " = " + test1.toStringDecimal());

        System.out.println(r1.toString() + " + " + r2.toString()+ " = " + Rational.add(r1,r2).toStringSimplfied() + " = " + Rational.add(r1,r2).toStringDecimal());

        System.out.println(r2.toString() + " - " + r3.toString()+ " = " + Rational.subtract(r2,r3).toStringSimplfied() + " = " + Rational.subtract(r2,r3).toStringDecimal());

        System.out.println(r3.toString() + " * " + r4.toString()+ " = " + Rational.multiply(r3,r4).toStringSimplfied() + " = " + Rational.multiply(r3,r4).toStringDecimal());

        System.out.println(r4.toString() + " / " + r1.toString()+ " = " + Rational.divide(r4,r1).toStringSimplfied() + " = " + Rational.divide(r4,r1).toStringDecimal());

    }
}
