package Article1;

/**
 * Created by Alex on 19.02.2019
 */
public class TryCatchFinally_ExeptionAndNoRightCatch {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch(Error e) {
            System.err.print(" 2");
        } finally {
            System.err.println(" 3");
        }
        System.err.print(" 4");
    }
}
