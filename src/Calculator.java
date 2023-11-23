public class Calculator {
    public static void main(String[] args) {

        int amountOfBricks = 75; // Odd number between 50 and 100
        int containerCapacity = 8; // Even number between 5 and 10


        int fullContainers = amountOfBricks / containerCapacity;


        int totalContainers = (int) Math.ceil((double) amountOfBricks / containerCapacity);


        int partialContainerBlocks = amountOfBricks % containerCapacity;


        System.out.println("Number of Lego bricks: " + amountOfBricks);
        System.out.println("Container capacity: " + containerCapacity);
        System.out.println("Number of full containers: " + fullContainers);
        System.out.println("Number of total containers: " + totalContainers);
        System.out.println("Number of blocks in the partial container: " + partialContainerBlocks);
    }
}
