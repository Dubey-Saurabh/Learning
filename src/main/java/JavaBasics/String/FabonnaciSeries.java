package JavaBasics.String;

public class FabonnaciSeries {

    public static void main(String[] args) {

        int a = 0, b = 1, result;

        System.out.print(a + " " + b);
        for (int i = 2; i < 10; i++) {
            result = a + b;
            System.out.print(" "+result);
            a = b;
            b = result;

        }

    }
}
