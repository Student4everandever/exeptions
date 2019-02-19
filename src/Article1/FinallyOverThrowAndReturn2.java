package Article1;

/**
 * Created by Alex on 19.02.2019
 */
public class FinallyOverThrowAndReturn2 {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            return 0;
        } finally {
            throw new RuntimeException();
        }
    }
}
