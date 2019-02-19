package Article2;

/**
 * Created by Alex on 19.02.2019
 */
public class NoThrowsOnlyCatch {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            // ...
        }
    }
}
