import java.util.*;

public class Lab08
{
  public static void main(String[] args)
  {
    if(args.length < 2)
    {
      System.out.println("usage java Lab08 <initWallet> <setupFile>");
      System.exit(1);
    }

    double wallet = Double.parseDouble(args[0]);
    String setupFN = args[1];

    Machine[] machines = Reader.machines(setupFN);
    Manager manager = new Manager(wallet, machines);

    Scanner in = new Scanner(System.in);
    String cmd;
    
    do
    {
      manager.draw();

      System.out.print("> ");
      
      cmd = in.next(); 
      manager.exec(cmd); // if manager doesn't recognize the cmd, 
                         // then it does nothing
                         // so it should do nothing on "quit"
    } while( !cmd.equals("quit") );
  }
}
