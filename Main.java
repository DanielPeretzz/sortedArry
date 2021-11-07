import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter a array length : ");
        int arryLength = SCANNER.nextInt();
        int[] arry = new int[arryLength];
        for (int i = 0; i < arry.length; i++) {
            System.out.print("enter a number : ");
            arry[i] = SCANNER.nextInt();
        }
        int tmp;
        for (int i = 0; i < arry.length; i++) {
            for (int j = i + 1 ; j < arry.length; j++) {
                if (arry[i] > arry[j]) {
                    tmp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = tmp;
                }

            }
        }
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i] + " ");

        }
    }
}