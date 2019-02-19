package Article2;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Alex on 19.02.2019
 */
public class MultiExeptions3 {
    public static void main(String[] args) throws IOException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}
