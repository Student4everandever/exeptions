package Article2;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Alex on 19.02.2019
 */
public class Overriding {
    // предок пугает IOException и InterruptedException
    public void f() throws IOException, InterruptedException {}
}

class Child extends Overriding {
    // а потомок пугает только потомком IOException
    @Override
    public void f() throws FileNotFoundException {}
}
