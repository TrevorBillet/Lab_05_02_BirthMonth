import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
     int birthMonth = 13;
    if (birthMonth >= 1 && birthMonth <= 12)
    {
        System.out.println("Your birth month is; " + birthMonth);
    }
    else
    {
        System.out.println("Invalid birth month entered, try again; " + birthMonth);
    }
    }
}
