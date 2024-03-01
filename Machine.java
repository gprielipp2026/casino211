import java.util.*; // for Random

public class Machine
{
  private String name;
  protected double maxPayout;
  private double potCasino;
  private double potAvailable;
  private double initialAvailable;
  private boolean putInCasinoPot;
  protected static final Random rand = new Random(System.currentTimeMillis());

  public Machine(String name, double maxPayout, double potAvailable)
  {
    this.name = name;
    this.maxPayout = maxPayout;
    this.potCasino = 0;
    this.potAvailable = potAvailable;
    this.initialAvailable = potAvailable;
    this.putInCasinoPot = true;
  }

  // where implementation of the machine really happens
  // catch phrase before implementation
  protected boolean playerWins()
  {
    System.out.println(getName() + ": You win! --> $" + maxPayout);
    return true;
  }

  public double play() 
  { 
    // each play takes one quarter ($0.25)
    // 1st quarter goes to the Casino
    // 2nd quarter goes to the Available
    if(putInCasinoPot)
    {
      potCasino += 0.25;
    }
    else
    {
      potAvailable += 0.25;
    }
    putInCasinoPot = !putInCasinoPot;

    // perform the play
    if(inService() && playerWins())
    {
      potAvailable -= maxPayout;

      return maxPayout; 
    }
    return 0; // did not win (the machine took the money)
  }
  
  public boolean inService() { return potAvailable > maxPayout; }
  
  public void report() 
  { 
    // report potCasino = "casino"
    System.out.print("casino: $" + potCasino + ", "); 
    
    // report potAvailable = "pot"
    System.out.print("pot: $" + potAvailable + ", "); 
    
    // report potCasino + potAvailable = "net"
    System.out.println("net: $" + (potCasino + potAvailable - initialAvailable) ); 
  }

  public String getName() { return name; }
}
