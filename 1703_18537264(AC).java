import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int minute = (n/60)%60;
        int second = n%60;
        int hour = (n/60)/60;

        System.out.print(hour+" ");
        System.out.print(minute+" ");
        System.out.print(second);
    }
}

