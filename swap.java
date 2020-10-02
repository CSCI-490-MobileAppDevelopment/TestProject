import java.util.Scanner;
class swap{
    public static void main(String[] args){
    System.out.println("Enter number1: ");
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    a=a+b;
    b=a+b;
    a=a-b;
    System.out.println("NUMBER1: "+a);
    System.out.println("NUMBER2: "+b);
    }
}