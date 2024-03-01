public class Pirate extends Machine
{
    public Pirate(String n, double i, double o){
        super(n, o, i);
    }

    protected boolean playerWins(){
        char[] vals = new char[3];
        int num;

        for (int i = 0; i < 3; i++){
        num = rand.nextInt(3);
        if (num == 0){
            vals[i] = '♈';
        }
        else if (num == 1){
            vals[i] = '✋';
        }
        else {
            vals[i] = '⛵';
        }
        }
    

    if (vals[0] == vals[1] && vals[0] == vals[2]) {
        System.out.println("Machine: " + vals[0] + vals[1] + vals[2] + " You've won and taken me treasure, scaliwag! --> " + maxPayout);
        return true;
    }
    else {
        System.out.println("Machine: " + vals[0] + vals[1] + vals[2] + " Arr, you lost, matey!");
        return false;
    }

}
}