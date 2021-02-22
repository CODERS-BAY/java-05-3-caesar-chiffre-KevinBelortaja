import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomOffset = new Random();
        int key = randomOffset.nextInt(26);
        System.out.println("Offset: +" + key);

        System.out.println("Text eingeben:");
        String letter = scan.nextLine();


        char[] chars = letter.toCharArray();


        for (char c : chars) {

            if (c == 32) {
                System.out.print(' ');
            }

            else if (c + key <= 122 && c + key >= 97|| c + key <= 90) {
                c += key;
                System.out.print(c);
            }
            else if (c + key > 122 || c + key > 90) {
                c += key - 26;
                System.out.print(c);
            }


        }



    }
}
