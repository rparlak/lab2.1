import java.util.Random;

public class RandomNumberChecker {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Generated random number: " + randomNumber);

        if (randomNumber % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
