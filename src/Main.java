import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int anul= input.nextInt();
        if(eAnBisect(anul)){
            System.out.println("Anul este bisect!");
        } else {
            System.out.println("Anul nu este bisect!");
        }

    }

    public static boolean eAnBisect(int nr){
        if((nr%4==0&&nr%100!=0)||nr%400==0){
            return true;
        } else {
            return false;
        }

    }
}
