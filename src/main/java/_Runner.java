/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _Runner {

    public static void main(String[] args) {
        try {
            System.out.println(checker(args[0], args[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Write x y");
        }

    }

    public static boolean checker(String xS, String yS) {

        double x = Double.parseDouble(xS);
        double y = Double.parseDouble(yS);

        if ((x <= 2 && y <= 4 && x >= -2 && y >= 0) || (x >= -4 && y >= -3 && x <= 4 && y <= 0)) {
            return true;
        } else {
            return false;
        }
    }

}
