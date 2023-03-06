import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int w= q.nextInt();
        if (w>99&&w<1000||w<-99&&w>-1000){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
