import java.util.Scanner;

public class Main {

    static int solution(int min, int max, int divider) {
        int b = max/divider;
        int a = (min > 0 ? (min - 1)/divider: 0);
        if(min == 0){
            b++;
        }
        return b - a;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = scan.nextInt();
        if(min>0){
            int max=scan.nextInt();
            if(max<2000000000){
                int divider = scan.nextInt();
                if((divider>0)&&(divider<2000000000)){
                    System.out.println(solution(min,max,divider));
                }
                else
                    System.out.println("ERROR !!!");
            }else
                System.out.println("ERROR !!!");
        }
        else
            System.out.println("ERROR !!!");


    }

}
