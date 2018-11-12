public class JavaOperators {

    public static void main(String[] args) {

        /*
        == TYPES OF JAVA OPERATORS ==

        Arithmetic operators
        + - * / % ++ (increment) -- (decrement)

        Relational operators
        == != > < >= <=

        Logical operators
        && || !

        Assignment operators
        = += -= *= x/= %=

        Conditional operators
        ?:

         */

        //You can declare multiple variables in a single statement
        int a = 10, b = 20, c = 15, d = 25;

        //Arithmetic operators

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("c % a = " + (c % a));

        a++; //Equivalent to a = a + 1;
        System.out.println("a++ = " + a);

        a--; //Equivalent to a = a - 1;
        System.out.println("a-- = " + a);

        //Relational operators - output is a boolean value

        System.out.println("a == b is " + (a == b));
        System.out.println("a != b is " + (a != b));
        System.out.println("a > b is " + (a > b));
        System.out.println("a < b is " + (a < b));
        System.out.println("a >= b is " + (a >= b));
        System.out.println("a <= b is " + (a <= b));

        //Logical operators - works on two booleans

        System.out.println("&& : " + ((a < b) && (a != b)));
        System.out.println("|| : " + ((a > b) || (a != b)));
        System.out.println("! : " + !(a > b));

        //Assignment operators
        c *= b; //c = c + b;
        System.out.println("c *= b = " + c);

        //Conditional operators
        int result = (a < b) ? 0 : 1;
        System.out.println("Result : " + result);

    }


}
