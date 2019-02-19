package Article2;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Alex on 19.02.2019
 */
public class MultiExeptions4 {
    // пугаем ПРЕДКОМ исключений
    public static void main(String[] args) throws IOException {
        f0();
        f1();
    }
    public static void f0() throws EOFException {}
    public static void f1() throws FileNotFoundException {}
}

