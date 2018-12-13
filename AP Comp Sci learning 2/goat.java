import javax.swing.JOptionPane;

public class goat
{
    public static void main()
    {
        
        String answer = JOptionPane.showInputDialog("How many numbers would you like in the array?");
        int numInt = Integer.parseInt(answer);
        
        while(numInt<10 || numInt>20)
        {
            answer = JOptionPane.showInputDialog("How many numbers would you like in the array?");
            numInt = Integer.parseInt(answer);
        }
        
        int myArray[] = new int[numInt];
        
        for(int i=0; i<myArray.length; i++)
        {
            int rand = (int)(Math.random()*90+10);
            myArray[i]= rand;
        }
        
        for(int e=0; e<myArray.length; e++)
        {
            System.out.print(myArray[e] + " ");
        }
        
        int r=1;
        
        int greatest= myArray[r];
        int compared = myArray[r-1];
        for(r<(myArray.length))
        {
            
            if(greatest<compared)
            {
               greatest=myArray[r];
               compared = myArray[r-1];
                r++;
            }
            else
            {
                greatest= 2; //incomplete - need to edit
            }
        }
        
    
    }
}
