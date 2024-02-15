public class DiceRoller  

{ 

    public static void main(String[] args) 

     { 

        int[] diceA = {1, 2, 3, 4, 5, 6}; 

        int[] diceB = {1, 2, 3, 4, 5, 6}; 

        int[][] sumOld = new int[diceA.length][diceB.length]; 

 
        int oddCountA = 0, evenCountA = 0; 

        for (int num : diceA) { 

            if (num % 2 == 0) evenCountA++; 

            else oddCountA++; 

        } 

 
        int[] newDiceA = {1, 2, 3, 2, 3, 4}; 

        int oddCountB = 0, evenCountB = 0; 

        int[] newDiceB = {1, 3, 4, 5, 6, 8}; // directly initialized with fixed values 

 

        for (int num : newDiceB) { 

            if (num % 2 == 0) evenCountB++; 

            else oddCountB++; 

        } 


        if (oddCountA == evenCountA && oddCountB == evenCountB) { 

            System.out.println("Conditions met proceed to frequency check!"); 

        } else { 

            System.out.println("Conditions not met hence failed!"); 

            System.exit(0); 

        } 

 
        if (checkFrequency(newDiceA, newDiceB, generateFrequencyArray(sumOld, diceA, diceB))) { 

            System.out.println("New dice A:"); 

            for (int num : newDiceA) { 

                System.out.println(num); 

            } 

            System.out.println("New dice B:"); 

            for (int num : newDiceB) { 

                System.out.println(num); 

            } 

        } else { 

            System.out.println("New dices do not have the same frequency distribution as old."); 

        } 

    } 

 
    public static int[] generateFrequencyArray(int[][] sum, int[] diceA, int[] diceB) { 

        int[] frequency = new int[13]; 

        for (int i = 0; i < diceA.length; i++) { 

            for (int j = 0; j < diceB.length; j++) { 

                sum[i][j] = diceA[i] + diceB[j]; 

                frequency[sum[i][j]]++; 

            } 

        } 

        return frequency; 

    } 

 
    public static boolean checkFrequency(int[] newDiceA, int[] newDiceB, int[] frequencyOld) { 

        int[][] sumNew = new int[newDiceA.length][newDiceB.length]; 

        int[] frequencyNew = new int[13]; 

        for (int i = 0; i < newDiceA.length; i++) { 

            for (int j = 0; j < newDiceB.length; j++) { 

                sumNew[i][j] = newDiceA[i] + newDiceB[j]; 

                frequencyNew[sumNew[i][j]]++; 

            } 

        } 

        for (int i = 2; i <= 12; i++) { 

            if (frequencyOld[i] != frequencyNew[i]) { 

                return false; 

            } 

        } 

        return true; 

    } 

}
