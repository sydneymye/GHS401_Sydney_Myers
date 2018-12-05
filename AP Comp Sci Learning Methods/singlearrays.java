

public class singlearrays
{
   public static void main(){
       
       
       //declare a variable that holds 12 values (an array)
       int[] myArray= new int[14];
       
       
       //the first spot in the array is 0, and the last is 11 ( there are still 12 spots )
       System.out.println("The length of the array is " + myArray.length);
       
       // storing values in the array - spot in brackets, value after equals sign
      
       myArray[0] = 33;
       myArray[4] = 56;
       myArray[9] = 47;
       myArray[1] = 17;
       myArray[0] = 7;
       
       myArray[myArray.length - 2] = 7; // it will always print in the second to last spot
      
       // for loop to print the array
       
       for(int i=0; i<myArray.length; i++) {
           
           System.out.println("The value of the element " + i + " is: " + myArray[i]);
        }
    }
}
