
import javax.swing.JOptionPane;
public class gradeCalculator
{
    public static void main()
    {
        String answer = JOptionPane.showInputDialog("Please enter your grade.");
        int grade = Integer.parseInt(answer);
        
        while(grade<0 || grade>100)//window pops up every time that they input answer wrong
        {
            //can go from a string answer to an int straight away
            grade=Integer.parseInt(JOptionPane.showInputDialog("Please input your grade"));
        }
        //have to redefine the variable every time in the while loop
        if(grade<60)
        {
            System.out.println("You Failed!!");
        }
        else if(grade<70)
        {
            System.out.println("You have a D!!");
        }
        else if(grade<80)
        {
            System.out.println("You have a C!!");
        }
        else if(grade<90)
        {
            System.out.println("You have a B!!");
        }
        else
        {
            System.out.println("You have an A!!");
        }
        //else
        //{
        //     System.out.println("Please enter valid grade");
       // }    this is won't keep printing the window if they input an invalid grade
        
    }
    
}
