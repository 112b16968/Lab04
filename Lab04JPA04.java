import java.util.Scanner;

public class Lab04JPA04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 1 ; i <= num ; i++){
            System.out.print(F(i)+" ");
            System.out.println();
        }
        

        input.close();
    }
    public static long F(int num){
        if (num ==0 || num == 1) {
            return 1;
        }
        else{
            return F(num-1) + F(num-2);
        }
    }
}
