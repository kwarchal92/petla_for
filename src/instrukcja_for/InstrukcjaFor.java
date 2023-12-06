package instrukcja_for;

public class InstrukcjaFor {

    public static void main(String[] args)

    {
        int x, y;

        System.out.println("wypisano 10 kolejno podanych wartosci funkcji y=3x: ");

        for (x = 0; x <= 10; x++)
        {
            y = 3 * x;
            System.out.println("x = " + x + '\t' + "y = " + y + '\t');
        }

    }

}
