package JavaBasics.String;

public class ExtractNumericAndStringValuesInString {

    public static void main(String[] args) {

        String s = "hello1235648w@##$^#@%^orld";


        System.out.println("nos would be : " + s.replaceAll("[^0-9]", ""));
        System.out.println("string would be : " + s.replaceAll("[^a-z]", ""));

    }
}