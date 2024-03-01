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
  }
}
