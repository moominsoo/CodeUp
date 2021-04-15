import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String student[] = new String[n];
        int score[] = new int[n];
        int Mscore[] = new int[n]; //3번째로 큰 수 크기비교용

        for (int i = 0; i < n; i++) {
            student[i] = scan.next();
            score[i] = scan.nextInt();
        }
        /*
        //배열 출력 (그냥)
        for (int i = 0; i < n; i++) {
            System.out.println(student[i]);
            System.out.println(score[i]);
        }
        */
        //score 배열 값 그대로 넣기
        for (int i = 0; i < n; i++) {
            Mscore[i] = score[i];
        }

        int max3 = 0;
        int c=0;

        for (int j = 0; j < n; j++)
            for (int i = 1; i < n; i++)
                if (Mscore[i-1] > Mscore[i]) {
                    c = Mscore[i-1];
                    Mscore[i-1] = Mscore[i];
                    Mscore[i] = c;
                }

        for (int i = 0; i < n; i++) {
            if (score[i] == Mscore[n-3]){
                max3 = i;
            }
        }

        System.out.println(student[max3]);


    }
}

