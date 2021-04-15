import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num[] = new int[n];

        //num = k.split(" ");

        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
            // 2 3 4 5 1 ...
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int i = cnt; i < n; i++) {
                    System.out.print(num[i] + " ");
                }
                for (int k = 0; k < cnt; k++) {
                    System.out.print(num[k] + " ");
                }
                cnt++;
                System.out.println(" ");
            }

        }
    }

/*01234 n-1 = 4
12340
23401
34012
40123
*/
