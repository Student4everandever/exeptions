package Article2;

import java.io.EOFException;
import java.io.FileNotFoundException;

/**
 * Created by Alex on 19.02.2019
 */
public class MultiExeptions {
    // пугаем ОБОИМИ исключениями
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}
