import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào độ lớn matrix: ");
        int[][] arr = generatorMatrix(sc.nextInt());
        printMatrix(arr);
        System.out.println("giá trị max là: " + findMax(arr));

    }

    static int[][] generatorMatrix(int n) {
        int[][] outRay = new int[n][n];
        for (int i = 0; i < outRay.length; i++) {
            int[] miniRay = new int[n];
            for (int j = 0; j < miniRay.length; j++) {
                miniRay[j] = (int) Math.round(Math.random());
            }
            outRay[i] = miniRay;
        }
        return outRay;
    }

    static void printMatrix(int[][] arr) {
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }
    }

    static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] x : arr) {
            for (int y : x) {
                if (max < y) {
                    max = y;
                }
            }
        }
        return max;
    }
}
