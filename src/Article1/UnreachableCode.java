package Article1;

/**
 * Created by Alex on 19.02.2019
 */
public class UnreachableCode {
    public static void main(String[] args) {
        try {
            System.err.println("try");
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
        //System.err.println("more");
    }
}
