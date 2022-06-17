import java.util.Scanner;

public class cost {
    public static double convertKshsPound(int x){
        int pound = x / 147;
        return pound;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ksh amount: ");
        int amount = sc.nextInt();
        System.out.println(convertKshsPound(amount));
    }
}
