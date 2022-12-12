import java.util.Scanner;

public class MainPlus{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input_first = scanner.nextInt();
        int input_second = scanner.nextInt();
        scanner.close();

        int output_plus = input_first + input_second;

        System.out.println(output_plus);
}
    
}