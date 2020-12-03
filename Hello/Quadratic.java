/* *****************************************************************************
 *  Name:              S. Urista
 *  Harvard ID:        81484503
 *  Last modified:     Dec 2020
 **************************************************************************** */

import static java.lang.Math.sqrt;

public class Quadratic {
    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double a = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double disc = b * b - (4 * a * c);
        double sol1 = (b * -1 + sqrt(disc)) / (2 * a);
        double sol2 = (b * -1 - sqrt(disc)) / (2 * a);
        System.out.println(sol1);
        System.out.println(sol2);


    }
}
