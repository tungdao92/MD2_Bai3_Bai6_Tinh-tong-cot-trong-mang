import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        System.out.println("nhập sô cột cần cộng");
        int col = sc.nextInt();
        int tong = 0;
        for (int i = col; i < 2; ) {
               for (int j = 0; j < 3; j++) {
                    tong += arr[col][j];
               }
            }System.out.println("Tổng cột muốn công: " + tong);
       }
    }
