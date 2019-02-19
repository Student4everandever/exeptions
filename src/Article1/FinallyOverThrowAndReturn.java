package Article1;

/**
 * Created by Alex on 19.02.2019
 */
public interface FinallyOverThrowAndReturn {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            return 0;
            //throw new RuntimeException();       // тот же результат!!!
        } finally {
            return 1;
        }
    }
}
