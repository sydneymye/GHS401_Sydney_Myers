

public class Morearrays
{
    public static void main(){
        
        int[] myArray = new int [100];
        
        
        for(int i=0; i<myArray.length; i++) {
            
            myArray[i] = i*5;
            // stores values in array increasing by a factor of 5
        }
        
        //for loop to print variable
        for(int e=0; e<myArray.length; e++) {
            System.out.println("The value of item " + (e+1) + " is " + myArray[e]);
            //(e+1) doesn't change the value of e as stored in computer, but just what is printed
        }
        
    }
}
