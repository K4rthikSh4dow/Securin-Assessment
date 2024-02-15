import java.util.Scanner; 

public class Main { 

    public static void calculateProbability(int numDice, int numFaces) { 

        int maxSum = numDice * numFaces; 

        int[] sumCount = new int[maxSum + 1]; 

 
        for (int i = 1; i <= numFaces; i++) { 

            for (int j = 1; j <= numFaces; j++) { 

                int sum = i + j; 

                sumCount[sum]++; 

            } 

        } 

 
        int totalCombinations = numFaces * numFaces; 

        System.out.println("Sum\tProbability"); 

        for (int i = 2; i <= maxSum; ++i) { 

            double probability = (double) sumCount[i] / totalCombinations; 

            System.out.printf("%d\t%.4f\n", i, probability); 

        } 

    } 

 
    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the number of faces on each die: "); 

        int numFaces = scanner.nextInt(); 

        System.out.print("Enter the number of dice: "); 

        int numDice = scanner.nextInt(); 

        if (numFaces <= 0 || numDice <= 0) { 

            System.err.println("Invalid input. Number of faces and dice must be positive."); 

            System.exit(1); 

        } 

 
        calculateProbability(numDice, numFaces); 

        scanner.close(); 

    } 

} 
