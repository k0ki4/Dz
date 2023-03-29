import java.util.Scanner;

public class Zadan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); //Line учитывает пробелы
        String result = str.replace('о' , '0');
        System.out.println(result);
    }
}

