import java.util.Scanner;

public class BasicNumber {
    public static void main(String[] args){
        int num;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = keyboard.nextInt();
        num = ((num + 5) * 2) - 7;
        System.out.println(num);

    }
}
