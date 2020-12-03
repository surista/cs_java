/* *****************************************************************************
 *  Name:              S. Urista
 *  Harvard ID:        81484503
 *  Last modified:     Dec 2020
 **************************************************************************** */

import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.random;

public class Exchange {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t = a;
        int sum = a + b;
        int product = a * b;
        int quot = a / b;
        int rem = a % b;
        double r = random();
        double mye = E;
        double mypi = PI;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + product);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);
        System.out.println(r);
        System.out.println(mypi);
        System.out.println(PI);


    }
}
