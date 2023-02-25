import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int N = sc.nextInt();

        // printing pyramid pattern using method printPyramidPattern() method of PyramidPattern class
        PyramidPattern.printPyramidPattern(N);
        
        // closing resource
        sc.close();
    }
}
