import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result = str.toUpperCase();
                System.out.print(result.charAt(i));
            }
            else {
                result = str.toLowerCase();
                System.out.print(result.charAt(i));
            }
        }
    }
}
