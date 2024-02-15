import java.util.Scanner; 

 

public class Main  

{ 

    public static void main(String[] args)  

    { 

        Scanner scanner = new Scanner(System.in); 

         

        System.out.println("Enter the number of faces of dice you are rolling"); 

        int numFaces = scanner.nextInt(); 

         

        System.out.println("Enter the number of dice you are rolling"); 

        int numOfDice = scanner.nextInt(); 

         

        int totalCombinations = 1; 

         

        System.out.println("Total combinations"); 

        for (int i = 1; i <= numOfDice; i++) { 

            totalCombinations *= numFaces; 

        } 

         

        System.out.println(totalCombinations); 

         

        scanner.close(); 

    } 

} 
