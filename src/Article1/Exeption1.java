package Article1;

/**
 * Created by Alex on 19.02.2019
 */
public class Exeption1 {
        public static void main(String[] args) {
            // sqr - "сломается" (из него "выскочит" исключение),
            double d = sqr(10.0);  // выполнение метода main() прервется в этой строчке и
            // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
            System.out.println(d); // и печатать нам ничего не придется!
        }
        public static double sqr(double arg) {
            throw new RuntimeException(); // "бросаем" исключение
        }
}
