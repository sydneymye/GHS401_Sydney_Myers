import javax.swing.JOptionPane;

public class mj
{
    public static void main()
    {
        String school = JOptionPane.showInputDialog("What is your school");
        
        if(school.equals ("Granada"))
        {
            String mascot = JOptionPane.showInputDialog("What is your school mascot");
            if(mascot.equals  ("Matadors"))
            {
                String[] artistArray = {"Rick Astley","Eagles","Rhianna","Michael Jackson", null};
                
                
                for(int i=0; i<artistArray.length; i++)
                {
                    if(artistArray[i] != null)//checking if the code is not null
                    {
                        if(artistArray[i].equals ("Michael Jackson"))
                        {
                            System.out.println("Spot #" + (i+1) + " has Michael Jackson");
                        }
                        else
                        {
                            System.out.println("Spot #" + (i+1) + " does not have Michael Jackson. The current element is " + artistArray[i]);
                        }
                    
                    }
                    else//if the array is null
                    {
                        System.out.println("Spot #" + (i+1) + " is empty"); 
                    }
                }
                
                
                String favorite = JOptionPane.showInputDialog("What is your favorite artist");
                
                if(favorite.equals ("Eagles"))//if their artist is the same
                {
                    System.out.println("We have the same taste");
                }
                else
                {
                    System.out.println("We do not have the same favorite artist");
                }
            }
       
            else
            {
                System.out.println("Mascot is wrong");
            }
        }
    
        else
        {
            System.out.println("School is incorrect");
            
        }
        
        
    }
}
