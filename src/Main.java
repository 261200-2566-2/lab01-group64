import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number do you want?");
        int length = scanner.nextInt();

        int[] read = readIntergers(length , scanner);

        System.out.println("Intergers: "+ Arrays.toString(read));

        }
        private static int[] readIntergers(int length, Scanner scanner){
            int[] intergers = new int[length];
                System.out.println("Enter intergers: ");
            for (int i = 0; i <= length-1; i++) {
                intergers[i] = scanner.nextInt();
            }
            Arrays.sort(intergers);
            return intergers;
        }
}