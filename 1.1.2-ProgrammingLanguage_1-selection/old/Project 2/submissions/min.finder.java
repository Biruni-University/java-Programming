import java.util.Scanner;

class QuickStart {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("enter first number: ");
        int Num1=input.nextInt();

        System.out.print("enter second number: ");
        int Num2=input.nextInt();

        System.out.print("enter third number: ");
        int Num3=input.nextInt();

        System.out.println("min of these three number: " + Math.min(Num1, Math.min(Num2, Num3)));
    }
}
//Suren(aka Behnam)