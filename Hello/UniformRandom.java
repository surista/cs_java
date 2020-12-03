/* *****************************************************************************
 *  Name:              S. Urista
 *  Harvard ID:        81484503
 *  Last modified:     Dec 2020
 **************************************************************************** */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniformRandom {
    public static void main(String[] args) {

        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        List<Double> values = Arrays.asList(a, b, c, d, e);
        double sum = a + b + c + d + e;
        double avg = (sum / 5);
        double myMax = +Collections.max(values);
        double myMin = +Collections.min(values);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(myMax);
        System.out.println(myMin);
        System.out.println(avg);


    }
}
