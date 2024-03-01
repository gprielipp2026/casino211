import java.io.*;
import java.lang.*;
import java.util.*;

public class Reader
{
  public static Machine[] machines(String fname)
  {
    //Scanner for file
    Scanner sc = null;
    try { sc = new Scanner(new FileReader(fname)); } 
    catch(IOException e) { e.printStackTrace(); System.exit(1); }

    String len;
    len = sc.next();
    int counter = len.length();

    Machine[] m = new Machine[counter];

    Machine tmp = null;
    String name;
    double p, in, pay;

    //Loop to create array of machines
    for (int i = 0; i < counter; i++){
      name = sc.next();

      if (name.equals("yoda")) {
        p = sc.nextDouble();
        in = sc.nextDouble();
        pay = sc.nextDouble();
        tmp = new Yoda(name, p, in, pay);
      }
      else if (name.equals("pirate")){
        in = sc.nextDouble();
        pay = sc.nextDouble();
        tmp = new Pirate(name, in, pay);
      }

      m[i] = tmp;
    }
    return m;
  }
}
