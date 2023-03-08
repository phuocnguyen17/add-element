import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        int X = sc.nextInt();
        int index = sc.nextInt();
        if (index < 0 || index > array.length - 1) {
            System.out.println("Không thể chèn phần tử vào mảng.");
        } else {
        }
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = X;
        System.out.println(Arrays.toString(array));
    }

}