package Article1;

/**
 * Created by Alex on 19.02.2019
 */
public class Bicycle {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        long rnd = System.currentTimeMillis();
        boolean finished = false;
        try {
            if (rnd % 3 == 0) {
                throw new Error();
            } else if (rnd % 3 == 1) {
                throw new RuntimeException();
            } else {
                // nothing
            }
            finished = true;
        } finally {
            if (finished) {
                // не было исключений
                return 0;                        // not recommended practice ))
            } else {
                // было исключение, но какое?
                return 1;                        // not recommended practice ))
            }
        }
    }
}
