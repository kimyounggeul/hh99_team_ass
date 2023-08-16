import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String num;
        while (true) {
            // 랜덤 숫자 생성
            int a = random.nextInt(10); //0 ~ 10보다 작은 것을 불러옴
            int b = random.nextInt(10);
            int c = random.nextInt(10);

            // a, b, c가 모두 다를때 구현
            if (a!=b && a!=c && b!=c) {
                num = Integer.toString(a) + Integer.toString(b) + Integer.toString(c);
                break;
            }
        }
        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");
        int total = 1;
        boolean isEnd = false;
        while (true) {
            System.out.print(total + "번째 시도 : ");
            String input = sc.next();
            int s = 0;
            int b = 0;
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    if(input.charAt(i)==num.charAt(j)){
                        if(i==j){
                            s++;
                        } else {
                            b++;
                        }
                    }
                }
            }

            if(s==3){
                System.out.println(s + "S");
                System.out.println(total + "번만에 맞히셨습니다!");
                System.out.println("게임을 종료합니다");
                break;
            }else if (b==3) {
                System.out.println(b + "B");
            } else {
                System.out.println(b + "B"+  s + "S");
            }

            total++;
        }
    }
}