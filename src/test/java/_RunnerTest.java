import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _RunnerTest {

    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {1, 1, true},
                {1, -1, true},
                {-1, -1, true},
                {-1, 1, true},
                {11, 1, false},
                {1, -11, false},
                {-11, -1, false},
                {-1, 11, false},
                {2, 4, true},
                {-2, 4, true},
                {4, -3, true},
                {-4, -3, true}
        };
    }

    @Test(dataProvider = "data")
    public void testChecker(Object x, Object y, Object result) throws Exception {
        assertEquals(_Runner.checker(String.valueOf(x), String.valueOf(y)), result);
    }

}