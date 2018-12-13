

public class squareRange
{
   
    public static void main()
    {
        int[] numbers= new int[11];
        for(int i=1; i<11; i++)
        {
            int square =i*i;
            int range = square - i;
            int rand = (int)(Math.random()*square + i);
            System.out.print("\n" + i+"\t"+ square + "\t"+ rand);
            if(rand == i)
            {
                System.out.println(" \t The random value is equal to the index");
            }
            else if(rand ==square)
            {
                System.out.println("\t The random value is equal to the square of the index");
            }
            
        }
        
        
        
    }
    public static void stringArrays()
    {
        String[] movies= {"Antman and the Wasp","Chocolat","The Hangover"};
        String[] songs= {"Gemini Vibe","Have Yourself A Merry Little Christmas","thank u, next"};
        
        for(int i=0; i< movies.length; i++)
        {
            System.out.println(movies[i]);
        }
        System.out.println();
        System.out.println();
        int r=0;
        while(r<songs.length)
        {
            System.out.print(songs[r]);
            
            if(r<(songs.length-1))
            {
                System.out.print(", ");
            }
            r++;
        }
    }
}
