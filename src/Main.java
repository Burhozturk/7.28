//Imponterer alle klasser fra java.util
import java.util.*;

//en klasse med navnet Main
public class Main 
{
    //en klasse som kun kan kører i denne klasse med en input
    public static void main(String[] args)
    {
        //En objekt af klassen Scanner med en input
        Scanner input = new Scanner(System.in);
        //En array af typen int med 10 værdier
        int inputLenght[] = new int[10];
        //En forløkke som kører fra 0 til strørrelsen af arrayet
        for (int i = 0; i < inputLenght.length; i++) 
        {
            //En print funktion
            System.out.println("Indtast næste tal");
            //Gemmer alle inputs i arrayet
            inputLenght[i] = input.nextInt();
        }
        //En objekt af random klassen
        Random rand = new Random();
        //En int med klassens metode med en input
        int n = rand.nextInt(10) + 0;
        //En objekt af klassen random
        Random rand2 = new Random();
        //En int med klassens metode med en input
        int n2 = rand2.nextInt(10) + 0;
        //Print funktion som printer en værdi som er random
        System.out.println(inputLenght[n]);
        //Print funktion son printer en værdi som er random
        System.out.println(inputLenght[n2]);
    }
}
