
public class randomstuff
{
    public static void main(){
        
        double age = Math.random();
        //this produces a number between 0 and 1 - can be 0, can't be 1
        
        double Age = Math.random()*7;
        // can manipulate a number between 0 and 1 to become bigger (now has a range of 7), but it will have as many decimal points
        
        
        
        for(int i=0; i<5; i++) {
            
            int AGE = (int) (Math.random()*8 + 367);
            // creates int between 0 and 8(the range of the data), then add 367 to change the range
            System.out.println("The number is " + AGE);
    }
    }
}
