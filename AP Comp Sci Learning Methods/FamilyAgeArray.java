
public class FamilyAgeArray
{
  public static void main(){
  
  //String[] names= new String [4]; - you cannot have this declaration with the one below (declared twice
  
  String[] names = {"Sydney","Adele","Mom","Dad"};//assign values in order to the array w/o for loop
  
  int[] ages={17,19,52,55};
  
  
  for(int i=0; i<ages.length; i++){
      
      System.out.println(names[i] + " is " + ages[i] + " years old!");
      
    }
}
}
