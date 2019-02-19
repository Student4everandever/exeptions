package Article2;

import java.io.IOException;

/**
 * Created by Alex on 19.02.2019
 */
public class OverridingError {
    public void f() throws IOException, InterruptedException {}
}

class ChildB extends OverridingError {
 //   @Override
    //public void f() throws Exception {}
}
