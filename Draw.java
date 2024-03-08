public class Draw 
{
  // prints elements of machine m with index
  // pos element highlighted (current machine)
  // relies on Machine.java for getName()
  // print each row by itself

  public static void show(Machine[] m, int pos) 
  {
    int maxWidth = 0;
    for(int i = 0; i < m.length; i++)
    {
      if(maxWidth < m[i].getName().length())
        maxWidth = m[i].getName().length();
    }

    // print boxes
    for(int row = 1; row <= 5; row++)
    {
      for(int i = 0; i < m.length; i++) // prints the machine of each row
      {
        if (pos == i)
          printRow(maxWidth, row, '#', m[i]);
        else
          printRow(maxWidth, row, '-', m[i]);
      }
      System.out.println();
    }
    // m[i].printRow(i);

  }

  private static void printRepeat(char c, int nTimes)
  {
    for(int i = 0; i < nTimes; i++)
      System.out.print(c);
  }

  private static void printRow(int maxMachineWidth, int row, char c, Machine m)
  {
    if (row == 1 || row == 5)
    {
      if (c == '#')
        printRepeat('#', maxMachineWidth+4);
      else 
        printRepeat('-', maxMachineWidth+4);
    }
    else if (row == 2 || row == 4)
    {
      if (c == '#')
      {
        System.out.print("#");
        printRepeat(' ', maxMachineWidth+2); 
        System.out.print("#");
      }
      else 
      {
        System.out.print("-");
        printRepeat(' ', maxMachineWidth+2); 
        System.out.print("-");
      }
    }
    else // row 3
    {
      if (c == '#')
        System.out.print("#");
      else  
        System.out.print("-");
      
      printRepeat(' ', (maxMachineWidth - m.getName().length())/2 + 1);
      System.out.print(m.getName());
      printRepeat(' ', (maxMachineWidth - m.getName().length())/2 + 1);

      if (c == '#')
        System.out.print("#");
      else  
        System.out.print("-");
    }


  }


  public static void main (String [] args)
  {
    // String name, double maxPayout, double potAvailable


  }
}

/**
 
    String name = "Yoda";
    System.out.println("##########"); // row 1
    System.out.println("# " + "\t" + " #"); // row 2
    System.out.print("# "+ " "); // row 3, left
    System.out.print(name); // row 3, middle
    System.out.print("  #\n"); // row 3, right
    System.out.println("# " + "\t" + " #"); // row 4, same as 2
    System.out.println("##########"); // row 5, same as 1

    name = "Pirate";
    System.out.println("##########");
    System.out.println("# " + "\t" + " #");
    System.out.print("# ");
    System.out.print(name);
    System.out.print(" #\n");
    System.out.println("# " + "\t" + " #");
    System.out.println("##########");


 */
