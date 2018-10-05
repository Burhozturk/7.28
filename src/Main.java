import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputLenght[] = new int[10];
        for (int i = 0; i < inputLenght.length; i++) {
            System.out.println("Indtast næste tal");
            inputLenght[i] = input.nextInt();
        }
        Random rand = new Random();
        int n = rand.nextInt(10) + 0;
        Random rand2 = new Random();
        int n2 = rand2.nextInt(10) + 0;

        System.out.println(inputLenght[n]);
        System.out.println(inputLenght[n2]);
    }
}