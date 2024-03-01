public class Draw 
{
  // prints elements of machine m with index
  // pos element highlighted (current machine)
  // relies on Machine.java for getName()
  // print each row by itself

  public static void show(Machine[] m, int pos) 
  {
    // print information for each round
    System.out.println("<<<<<<<" + "getMoney()" + ">>>>>>>");
    // print boxes
    for(int i = 0; i < m.length; i++)
    { 
      if(i == pos)
        System.out.println("Highlighted:"); 
     System.out.println(m[i].getName()); 
    }
    // m[i].printRow(i);

  }

  public void printRow(int row){
    if (row == 1 || row == 5)
    {

    }
    else if (row == 2 || row == 4)
    {

    }
    else {

    }


  }


  public static void main (String [] args)
  {
    String name = "Yoda";
    System.out.println("##########");
    System.out.println("# " + "\t" + " #");
    System.out.print("# "+ " ");
    System.out.print(name);
    System.out.print("  #\n");
    System.out.println("# " + "\t" + " #");
    System.out.println("##########");

    name = "Pirate";
    System.out.println("##########");
    System.out.println("# " + "\t" + " #");
    System.out.print("# ");
    System.out.print(name);
    System.out.print(" #\n");
    System.out.println("# " + "\t" + " #");
    System.out.println("##########");

  }
}

/*
 
  // if i == pos then box is #, else box is -
  // use an argument (passed from call) to declare a variable (assigned # or -) and keep printing the var?
  public void printCurrentBox(String name){
    for (int i = 0; i < 6; i++) // row #
    {
      if (i == 0 || i == 5) // top and bottom rows
      {
        System.out.println("##########");
      }
      else if (i == 2 || i == 4) // second and fourth rows
      {
        System.out.println("# " + "\t" + " #"); 
      }
      else // middle row
      {
        for (int j = 0; j < 10; j++) // col #
        {
          if (m.getName().equals("Yoda"))
            System.out.print("#  " + name + "  #");
          else if (m.getName().equals("Pirate"))
            System.out.print("# " + name + " #");
        } // inner for loop
      } // else
    } // outer for loop
  }

 */