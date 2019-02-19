package Article1;

/**
 * Created by Alex on 19.02.2019
 */
public class RightWay {
    public static void main(String[] args) {
        double d = area(2, 5);
        System.out.println(d);
    }

    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return width * height;
    }
}
