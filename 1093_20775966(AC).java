import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int[] arr = new int[24];
        int[] call = new int[num];

        for(int i=0; i<num; i++){
            call[i] = scan.nextInt();
        }
        for(int i=0; i<num; i++){
            arr[call[i]]++;
        }

        for(int i=1; i<24; i++){
            System.out.print(arr[i]+" ");
        }
    }
};

