import java.util.Scanner;

public class MissingValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test>0) {
            int len = input.nextInt();
            int total = len*(len+1)/2;
            for(int i=0; i<len-1; i++){
                int num = input.nextInt();
                total -= num;
            }
            System.out.println(total);
            test--;
        }
    }
}
