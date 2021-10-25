package classwork.Day3;



import java.util.Scanner;
public class RollDie
{
   public static void main( String args[] )
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter how much time you want to roll a dice:");
	   int message = sc.nextInt();
	   int[] rolledValue = generateRolledValues(message);
	   int[] countedRolls = countRolls(rolledValue);
      showResults(countedRolls);
      sc.close();
      }
   

public static void showResults(int[] countedRolls)
   {

     	String output = "Total\n";
     	
     	for (int dice = 2; dice < countedRolls.length; dice++) {
     	
     	output += dice + " = " + countedRolls[dice] + "\n";
     	}
     	
     System.out.print(" output is :"+output);  
    
 
   }

  public static int[] generateRolledValues(int message) {
	   	int[] rolledValue = new int[101]; 	
   for (int i = 1; i < rolledValue.length; i++ ) {
    
  	 rolledValue[i] = rollDice();  
  	 
   }
	return rolledValue;
}
  
  public static int[] countRolls(int[] rolledValue) {
	 
	  int[] countedRolls = new int[13];
   	  for(int r = 1; r < rolledValue.length; r++) {
   		
   		countedRolls[rolledValue[r]]++; 
   	}
   	return countedRolls;
	}
  
   public static int rollDice()
   {	
     return (1 + ( int ) ( Math.random() * 6 )) + (1 + ( int ) ( Math.random() * 6 ));
   }
   
   
}