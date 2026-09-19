import java.util.Scanner;

class RecursiveFunc {
    static void printFun(int num)
    {
        if (num < 1)
            return;
        else {
            System.out.printf("%d ", num);
            printFun(num - 1); // statement 2
            System.out.printf("%d ", num);
            return;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        printFun(num);
    }
}