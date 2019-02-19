package Article2;

/**
 * Created by Alex on 19.02.2019
 */
public class TrickyErrorCase2 {
    public static void main(String[] args) throws Exception {
        Object ref = "Hello!";  // ref указывает на строку
        //char c = ref.charAt(0); // но тут ошибка компиляции
    }
}
