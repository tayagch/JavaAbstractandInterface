import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input count for Cock");
        int cockCount = input.nextInt();
        System.out.println("Input count for Hen");
        int henCount = input.nextInt();
        System.out.println("Input count for Chicken");
        int chicksCount = input.nextInt();
        int result = 0;
        input.close();

        result = (cockCount * 5) + (henCount * 3) + (chicksCount / 3);
        System.out.println(result == 100 ? "You can buy for the price of 100 yuan":"You Can't buy for the price of 100 yuan");

    }
}
