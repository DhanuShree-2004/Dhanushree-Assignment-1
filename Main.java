package Engineering;
import java.util.*;
public class Main {
    public static void rotateLeft(char[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }
    private static void reverse(char[] arr, int s, int e) {
        while (s < e) {
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--; }    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the number to rotate: ");
        int k = sc.nextInt();
        char[] arr = str.toCharArray();
        rotateLeft(arr, k);
        System.out.println("Rotated string: " + new String(arr));   }}
