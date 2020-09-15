import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        print("Enter word:");
        String message = enter();
        print("Type 0 if you want to convert cyrToLat, otherwise type 1 ");
        int type = Integer.parseInt(enter());
        Converter converter = new Converter();

        print("Your converted word:" + converter.convert(message, type));

    }

    static void convert(){

    }

    static void print(String text) {
        System.out.println(text);
    }

    static String enter() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }


}
