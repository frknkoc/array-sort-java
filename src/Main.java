import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int number;
       Scanner input =  new Scanner(System.in);
        System.out.println("lütfen kaç sayı girmek istediğinizi giriniz...");
        number = input.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++){
            System.out.println("lütfen girmek istediğiniz " + (i + 1) + ". sayıyı giriniz...");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}