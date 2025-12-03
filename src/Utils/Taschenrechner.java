package Utils;

import com.sun.tools.javac.Main;

public class Taschenrechner
{
    public static int add(int a, int b)
    {
        return a+b;
    }

    public static int sub(int a,int b)
    {
        return a-b;
    }

    public static int multiply(int a,int b)
    {
        return a*b;
    }

    public static int divide(double a,double b)
    {
        if (b == 0)
        {
            System.out.println("Division by zero makes no sens!");
            return 0;
        }

        return (int)(a/b);
    }
}
