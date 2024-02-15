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

        System.out.println("The total combinations are"); 

         
        for (int i = 1; i <= numFaces; i++)  

        { 

            for (int j = 1; j <= numFaces; j++)  

            { 

                System.out.print("(" + i + " " + j + ")" + "\t"); 

            } 

            System.out.println(); 

        } 

        scanner.close(); 

    } 

} 
