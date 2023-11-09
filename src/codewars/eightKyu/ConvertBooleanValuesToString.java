package codewars.eightKyu;

//https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java

public class ConvertBooleanValuesToString {
    public static String boolToWord(boolean b) {
        if (!b) {
            return "No";
        } else return "Yes";
    }
}