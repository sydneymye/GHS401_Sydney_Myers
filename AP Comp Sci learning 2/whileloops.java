//while loops are useful for when a loop needs to repeat for an uncertain amount of time
import javax.swing.JOptionPane;
public class whileloops
{
    public static void main()
    {
        int num = 0;
        
        while(num<10)//if I replace the while loop with a for loop, 
        //there is an error in the condition statement
        {
            System.out.println(num);
            num++;
            
        }
        
    }
    public static void main2()
    {
        String age= JOptionPane.showInputDialog("What is your age?");
        int numAge = Integer.parseInt(age);//have to parse the age to an integer
        
        while(numAge<0 || numAge>120)
        {
            System.out.println("Invalid");
            age = JOptionPane.showInputDialog("What is your age?");//window will keep popping up 
            numAge = Integer.parseInt(age);//until a correct value is entered, where it will exit the loop
        }
        System.out.println("Correct");
        
        
    }
}
