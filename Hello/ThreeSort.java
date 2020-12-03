/* *****************************************************************************
 *  Name:              S. Urista
 *  Harvard ID:        81484503
 *  Last modified:     Dec 2020
 **************************************************************************** */

package Hello;

import java.util.Arrays;
import java.util.List;

public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        List<Integer> values = Arrays.asList(a, b, c);

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int myMid = a + b + c - min - max;


        System.out.print(min + " " + myMid + " " + max);
    }

}
