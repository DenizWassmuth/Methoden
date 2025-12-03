import Utils.Taschenrechner;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // LEVEL 1

        // zu 1
        printHello("Hello Welt");

        // zu 2
        printString(getGreeting());

        // zu 3
        halloUser("Deniz");


        // LEVEL 2

        // zu 1
        printString(String.valueOf(add(1,2)));

        // zu 2
        printString(String.valueOf(calculateArea(1,2)));

        // zu 3
        Scanner input = new Scanner(System.in);
        checkPositive(input.nextInt());

        printString("\nErsten Summanden eingeben: ");
        int n1=input.nextInt();
        printString("\nZweiten Summanden eingeben: ");
        int n2=input.nextInt();

        String OutPutString = "\nDas Ergebnis ist: " + Taschenrechner.Add(n1,n2);
        printString(OutPutString);
    }

    public static void printString(String str)
    {
        System.out.println("\n" + str);
    }


    // LEVEL 1

    // 1. Einfache Methode ohne Rückgabewert
    //    Erstelle eine Methode printHello, die "Hallo Welt" auf der Konsole ausgibt.
    //    Rufe die Methode in main auf.

    public static void printHello(String text)
    {
        printString(text);
    }


    // 2. Einfache Methode mit Rückgabewert
    //    Erstelle eine Methode getGreeting, die einen String zurückgibt: "Willkommen im Java-Kurs".
    //    Gib das Ergebnis in der main-Methode auf der Konsole aus.

    public static String getGreeting()
    {
        return "Willkommen im Java-Kurs";
    }


    // 3. Parameter verwenden
    //    Schreibe eine Methode printName, die einen Namen als Parameter erhält und "Hallo <Name>" ausgibt.

    public static void halloUser(String userName)
    {
        printString("Hallo " + userName);
    }


    // LEVEL 2

    // 1. Berechnungsmethode
    // Erstelle eine Methode add, die zwei int-Werte addiert und das Ergebnis zurückgibt.
    // Speichere das Ergebnis in einer Variable und gib es aus.

    public static int add(int a, int b)
    {
        return a+b;
    }

    // 2. Mehrere Datentypen zurückgeben
    // Schreibe eine Methode calculateArea, die zwei double-Parameter (width, height) entgegennimmt und die Fläche zurückgibt.
    // Hinweis: Fläche = Breite × Höhe.

    public static double calculateArea(double a, double b)
    {
        return a*b;
    }

    // 3. Vorzeitiges Beenden
    // Erstelle eine void-Methode checkPositive, die eine Zahl prüft.
    // Falls die Zahl negativ ist, gibt sie "Negative Zahl" aus und beendet die Methode sofort.

    public static void checkPositive(int zahl)
    {
        if (zahl < 0)
        {
            printString("Zahl ist negativNegative Zahl");
            return;
        }
    }
}
