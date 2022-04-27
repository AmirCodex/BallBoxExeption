import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Ball = scanner.nextInt();
        try
        {
            if (Ball > 10)
              throw new BallBoxException();
            else
                System.out.println("succeed - Now the balls are in the box");
        }
        catch (BallBoxException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}