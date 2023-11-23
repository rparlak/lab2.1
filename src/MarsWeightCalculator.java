public class MarsWeightCalculator {
    public static void main(String[] args) {

        String name = "YourName"; // Replace with your name
        float earthWeightBielecki = 70.0f;
        float marsGravityPercentage = 0.38f;


        float marsWeightBielecki = earthWeightBielecki * marsGravityPercentage;


        double marsWeightDouble = marsWeightBielecki;


        System.out.printf("Mars weight (double): %.4f\n", marsWeightDouble);


        int marsWeightInt = (int) marsWeightDouble;
        System.out.println("Mars weight (int): " + marsWeightInt);


        char marsWeightChar = (char) marsWeightInt;
        System.out.println("Mars weight (char): " + marsWeightChar);


        int resultInt = marsWeightChar + 10;
        System.out.println("Result after math operation: " + resultInt);
    }
}
