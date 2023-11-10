package codewars.eightKyu;

//https://www.codewars.com/kata/59ca8246d751df55cc00014c

public class IsHeGonnaSurvive {

    public static boolean hero(int bullets, int dragons) {
        if ((long)bullets >= (long)dragons*2) {
            return true;
        } else
            return false;
    }
}