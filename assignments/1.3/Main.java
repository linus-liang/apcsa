import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("2p/(q+1) program (does integer divisison)");
        
        System.out.println("Input integer p: ");
        int p = s.nextInt();
        
        System.out.println("Input integer q: ");
        int q = s.nextInt();

        try {
            System.out.println("2*" + p + "/(" + q + "+1) is " + 2*p/(q+1));
        } catch(ArithmeticException e) {
            System.out.println("You can not divide by 0");
        }
    }
}
