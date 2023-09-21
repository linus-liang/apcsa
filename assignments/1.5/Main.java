import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("(a+b)/c program");
        
        System.out.print("Input an integer for a: ");
        int a = s.nextInt();

        System.out.print("Input an integer for b: ");
        int b = s.nextInt();

        System.out.print("Input an integer for c: ");
        int c = s.nextInt();

        System.out.println("(" + a + "+" + b + ")/" + c + " is " + (a+b)/c);
    }
}
