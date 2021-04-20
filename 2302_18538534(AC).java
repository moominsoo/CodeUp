import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //과목의 수
        String[] name = new String[n]; //과목 이름
        String[] grade = new String[n]; //과목 학점
        int[] point = new int[n]; //과목 취득 학점
        List<String> reName = new ArrayList<String>(); //재수강 과목
        List<String> reGrade = new ArrayList<String>(); //재수강 학점

        for (int i=0; i<n;i++){
            name[i] = scan.next();
            grade[i] = scan.next();
            point[i] = scan.nextInt();
        }

        int score = 0;
        //학점의 합 구하기
        for (int i=0; i<n;i++){
            score += point[i];
        }
        //학점평균 구하기 + 재수강 여부 구하기

        double sum=0;
        int retake =0;

        for (int i=0; i<n;i++){
            if(grade[i].equals("A+")){
                sum += (4.3*point[i]);
            }
            else if(grade[i].equals("A0")){
                sum += (4.0*point[i]);
            }
            else if(grade[i].equals("A-")){
                sum += (3.7*point[i]);
            }
            else if(grade[i].equals("B+")){
                sum += (3.3*point[i]);
            }
            else if(grade[i].equals("B0")){
                sum += (3.0*point[i]);
            }
            else if(grade[i].equals("B-")){
                sum += (2.7*point[i]);
            }
            else if(grade[i].equals("C+")){
                sum += (2.3*point[i]);
                retake +=1;
                reName.add(name[i]);
                reGrade.add(grade[i]);
            }
            else if(grade[i].equals("C0")){
                sum += (2.0*point[i]);
                retake +=1;
                reName.add(name[i]);
                reGrade.add(grade[i]);
            }
            else if(grade[i].equals("C-")){
                sum += (1.7*point[i]);
                retake +=1;
                reName.add(name[i]);
                reGrade.add(grade[i]);
            }
            else if(grade[i].equals("D+")){
                sum += (1.3*point[i]);
                retake +=1;
                reName.add(name[i]);
                reGrade.add(grade[i]);
            }
            else if(grade[i].equals("D0")){
                sum += (1.0*point[i]);
                retake +=1;
                reName.add(name[i]);
                reGrade.add(grade[i]);
            }
            else if(grade[i].equals("D-")){
                sum += (0.7*point[i]);
                retake +=1;
                reName.add(name[i]);
                reGrade.add(grade[i]);
            }
            else if(grade[i].equals("F")){
                sum += (0.0*point[i]);
                retake +=1;
                reName.add(name[i]);
                reGrade.add(grade[i]);
            }
            else if(grade[i].equals("Pass")){
                sum += (4.3*point[i]);
            }
            else if(grade[i].equals("Fail")){
                sum += (0.0*point[i]);
                retake +=1;
                reName.add(name[i]);
                reGrade.add(grade[i]);

            }
        }
        double avg = sum/score;
        double total = Math.round(avg*100)/100.0; //소수 둘째자리에서 반올림

        String myGrade = null;

        if (total==4.30){
            myGrade="A+";
        }
        else if (total>=4.00 && total<=4.29){
            myGrade="A0";
        }
        else if (total>=3.70 && total<=3.99){
            myGrade="A-";
        }
        else if (total>=3.30 && total<=3.69){
            myGrade="B+";
        }
        else if (total>=3.00 && total<=3.29){
            myGrade="B0";
        }
        else if (total>=2.70 && total<=2.99){
            myGrade="B-";
        }
        else if (total>=2.30 && total<=2.69){
            myGrade="C+";
        }
        else if (total>=2.00 && total<=2.29){
            myGrade="C0";
        }
        else if (total>=1.70 && total<=1.99){
            myGrade="C-";
        }
        else if (total>=1.30 && total<=1.69){
            myGrade="D+";
        }
        else if (total>=1.00 && total<=1.29){
            myGrade="D0";
        }
        else if (total>=0.70 && total<=0.99){
            myGrade="D-";
        }
        else if (total>=0.00 && total<=0.69){
            myGrade="F";
        }
        //출력

//        System.out.println("Average : "+total+" ("++")\n");
        System.out.printf("Average : "+"%.2f "+"("+myGrade+")\n",avg);
        System.out.println(" RETAKE NEEDED ("+retake+")");
        for(int i=0;i<retake;i++){
            System.out.println(" "+reName.get(i)+" ("+reGrade.get(i)+")");
        }


}
}

