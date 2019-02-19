package Article1;

/**
 * Created by Alex on 19.02.2019
 */
public class TryAndFinalyWithoutCatch {
    public static void main(String[] args) {
        try {
            System.err.println("try");
            if (true) {throw new RuntimeException();}
           // {return;}                                //тот же результаты!!!
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }
}
