package Article2;

import java.io.EOFException;
import java.io.FileNotFoundException;

/**
 * Created by Alex on 19.02.2019
 */
public class MultiExeptions2 {
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        f0();
        f1();
    }
    public static void f0() throws EOFException {}
    public static void f1() throws FileNotFoundException {}
}
