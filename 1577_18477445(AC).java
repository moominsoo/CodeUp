import java.util.Scanner;
public class Main {
    public static int myabs(int n) {
        if (n>=0){
            return n;
        }
        else {
            return -n;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = myabs(n);
        System.out.println(result);
    }
}

