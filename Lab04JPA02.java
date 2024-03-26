import java.util.Scanner;

public class Lab04JPA02 {
    public static void main(String[] args) {
        double total = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入學生人數:");
        int student = input.nextInt();
        double [] scores = new double[student];
        for(int i =0; i < scores.length; i ++){
            System.out.print("第"+(i+1)+"個學生的成績:");
            double input1 = input.nextDouble();
            scores[i] =input1;
            total += scores[i];
        }
        System.out.println("人數:"+student);
        System.out.println("總分:"+total);
        System.out.println("平均:"+(double)total/student);
        input.close();
    }
}
