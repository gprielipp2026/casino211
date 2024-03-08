public class Yoda extends Machine
{   private double probability;
    
    public Yoda(String n, double p, double i, double o){
        super("Yoda", o, i);
        probability = p;
    }

    protected boolean playerWins(){
        if (rand.nextDouble(0, probability) <= probability){
            System.out.println("Machine: ⓗ Strong is the Force in this one. Won you have.--> $" + maxPayout);
            return true;
        }
        System.out.println("Machine: ⓣ There is no win, only lose or lose not. Lost you did.");
        return false;
    }

}
