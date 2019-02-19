package Article1;

/**
 * Created by Alex on 19.02.2019
 */
public class FinallyOverThrowAndReturn3 {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            throw new Error();
        } finally {
            throw new RuntimeException();
        }
    }
}
