package homework20;

/**
 * Java Professional Homework #20
 *
 * @author Artysh
 * @version 23.01 - 26.01
 */

import java.util.Arrays;

public class Homework20 {

    public static final String ERROR = "This array doesn't contain 4";

    public int[] arrayForTest(int[] x) {
        int[] result = new int[]{0};
        for (int i = x.length - 1; i >= 0; i--) {
            if (x[i] == 4) {
                int[] newArray = new int[x.length - i - 1];
                System.arraycopy(x, i + 1, newArray, 0, x.length - i - 1);
                result = newArray;
                break;
            } else {
                //throw new RuntimeException(ERROR);
                result = x;
            }
        }
        return result;
    }
}
