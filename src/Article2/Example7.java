package Article2;

/**
 * Created by Alex on 19.02.2019
 */
public class Example7 {
    // предок пугает Exception
    public void f() throws Exception {}
}

/*
// тут ошибка компиляции в Java, но, ДОПУСТИМ, ее нет
class Child extends Example7 {
    // потомок расширил Exception до Throwable
    //public void f() throws Throwable {}
}
*/

class Demo {
    public static void test(Example7 ref) {
        // тут все компилируется, Parent.f() пугает Exception и мы его ловим catch
        try {
            ref.f();
        } catch(Exception e) {}
    }
}


class App {
    public static void main(String[] args) {
        // тут все компилируется, Demo.test хотел Parent и мы дали ему подтип - Child
        Demo.test(new Child());
    }
}

