import javax.swing.JOptionPane;
//extra credit fibinachi sequence program
public class fibby
{
    public static void main()
    {
        String stringFib = JOptionPane.showInputDialog("How many numbers would you like in the sequence?");
        int numFib = Integer.parseInt(stringFib);
        int[] numbers = new int[numFib];
        
        
        for(int u=0; u<numbers.length; u++)
        {
            numbers[u] = (u+1);
            
            
        }
        
        int[] fibonacci = new int[numFib];
        
        
        fibonacci[0]=0;
        fibonacci[1]=1;
        
        for(int r=2; r<fibonacci.length; r++)
        {
        
            fibonacci[r] = fibonacci[(r-2)] + fibonacci[(r-1)];
        
        }
        System.out.println("Index \t Fib Num. \t Running Total");
        int arraySum = 0;// nothing in array right now
        
        for(int i=0; i<fibonacci.length; i++)
        {
            arraySum = arraySum + fibonacci[i];
            System.out.println(numbers[i] + "\t" + fibonacci[i] + "\t" + "\t" + arraySum);
   
            
        }
        
    }
}
