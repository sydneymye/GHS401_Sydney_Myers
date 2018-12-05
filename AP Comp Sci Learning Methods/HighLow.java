import javax.swing.JOptionPane;

public class HighLow
{
    public static void main(){
        
        String higha = JOptionPane.showInputDialog("Please enter a high number.");
        int high = Integer.parseInt(higha);
        
        String lowa = JOptionPane.showInputDialog("Please enter a low number.");
        int low = Integer.parseInt(lowa);
        
        String lena = JOptionPane.showInputDialog("How many numbers in the array?");
        int len = Integer.parseInt(lena);
        
        
        if(low>=high){//if values are invalid
            System.out.println("ERROR");
            
        }
        else{
            int[] myArray = new int[len];//creating array
            int range =(high - low);
            range++;
            int n=0;
           
            
            for(int i=0; i<myArray.length; i++){
                
                int rand = (int) (Math.random()*range + low);
                myArray[i] = rand;
                
                System.out.print("Spot #" + (i+1) + " is " + rand);
                
                
                if(rand%2 == 0)
                {
                    System.out.println(" which is even.");
                    n++;
                }
                else
                {
                    System.out.println(" which is odd.");
                    
                }
            }
            
            
            System.out.println("The array has " + n + " even numbers and " + (len-n) + " odd numbers!");
            
            
        }
        
    }
}
