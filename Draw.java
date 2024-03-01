public class Draw 
{
  public static void show(Machine[] m, int pos) 
  {
    for(int i = 0; i < m.length; i++)
    { 
     if(i == pos)
        System.out.println("Highlighted:"); 
     System.out.println(m[i].getName()); 
    }
  }
}
