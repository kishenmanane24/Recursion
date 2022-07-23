import java.util.Scanner;

public class Source {

    /* This method returns the product of a and b using recursion */
    static int findProduct(int a, int b) {

        // Write your code here
        if (a < b)
            return findProduct(b, a);

            // iteratively calculate
            // y times sum of x
        else if (b != 0)
            return (a * b);

            // if any of the two numbers is
            // zero return zero
        else
            return 0;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

       /* If Math.abs(b) is greater than Math.abs(a), then find the product of b and
        a by passing b and a to 'findProduct' */
        if (Math.abs(b) > Math.abs(a)) {
            System.out.println(findProduct(b, a));
        } else {
            System.out.println(findProduct(a, b));
        }
    }
}

