package Article2;

/**
 * Created by Alex on 19.02.2019
 */
public class TrickyErrorCase1 {
    // пугаем Exception
    public static void main(String[] args) throws Exception {
        Throwable t = new Exception(); // и лететь будет Exception
        //throw t; // но тут ошибка компиляции

        //Анологично
        Object ref = "Hello!";  // ref указывает на строку
        //char c = ref.charAt(0); // но тут ошибка компиляции
    }
}
