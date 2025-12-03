import Utils.Taschenrechner;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // zu 1
        printHello("Hello Welt");

        // zu 2
        printString(getGreeting());

        // zu 3
        halloUser("Deniz");

        Scanner input = new Scanner(System.in);

        printString("\nErsten Summanden eingeben: ");
        int n1=input.nextInt();
        printString("\nZweiten Summanden eingeben: ");
        int n2=input.nextInt();

        String OutPutString = "\nDas Ergebnis ist: " + Taschenrechner.Add(n1,n2);
        printString(OutPutString);
    }

    public static void printString(String str)
    {
        System.out.println(str);
    }


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

}
