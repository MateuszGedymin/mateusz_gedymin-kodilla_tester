import java.util.Scanner;

public class Switch {

    public static void getUserChoice() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your color letter: R - Red, B - Blue, G - Green");
            String letter = scanner.nextLine().trim().toUpperCase();

            switch (letter) {
                case "R":
                    System.out.println("Red");
                    break;
                case "B":
                    System.out.println("Blue");
                    break;
                case "G":
                    System.out.println("Green");
                    break;
                default: System.out.println("It's not our color!!");
            }
    }

    public static void main(String[] args) {
         getUserChoice();
    }
}