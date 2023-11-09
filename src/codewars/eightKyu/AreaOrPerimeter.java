package codewars.eightKyu;

//https://www.codewars.com/kata/5ab6538b379d20ad880000ab/train/java

public class AreaOrPerimeter {
    public static int areaOrPerimeter(int l, int w) {
        if (l == w) {
            return l * w;
        } else return 2 * (l + w);
    }
}