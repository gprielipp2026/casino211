public class Manager
{
  private Machine[] machines;
  private int pos;
  private double wallet;

  public Manager(wallet, Machine[] machines)
  {
    this.wallet = wallet;
    this.machines = machines;
    pos = 0;
  }

  public void draw()
  {
    // draw machines and money
    System.out.println();
    System.out.println("<<<<<<< You have $" + wallet  + " >>>>>>>");
    Draw.show(machines, pos);
  }

  public void exec(String comm)
  {
    // execute left/right/play/*report
    if(comm.equals("left") && pos > 0)
    {
      pos--;
    }
    else if(comm.equals("right") && pos+1 < machines.length)
    {
      pos++;
    }
    else if(comm.equals("play"))
    {
      wallet += machines[pos].play() - 0.25;
    }
    else if(comm.equals("*report"))
    {
      for(Machine m : machines)
      {
        m.report();
      }
    }
  }
}
