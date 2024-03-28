package week3;

import java.util.Scanner;

public class MedianFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i =0; i<5; i++){
            System.out.print("입력: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Median: "+ arr[2]);
    }
}
