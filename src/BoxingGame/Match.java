package BoxingGame;

public class Match {
    private Fighter fighter1;
    private Fighter fighter2;
    int minweight;
    int maxweight;

    public Match(Fighter fighter1, Fighter fighter2, int minweight, int maxweight){
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minweight = minweight;
        this.maxweight = maxweight;
    }
    void StartRun(){
        if (fighter1.IsHit()){
            run(fighter1, fighter2);
        }else{
            run(fighter1,fighter1);
        }
    }

    void run(Fighter f1, Fighter f2){
        if(IsCheck()){
            while(fighter1.getHealth() > 0 && fighter2.getHealth() > 0)
            {
                System.out.println(" ");
                System.out.println("=====New Game======");
                fighter2.setHealth(fighter1.hit(fighter2));

                if (IsWin()){
                    break;
                }

                fighter1.setHealth(fighter2.hit(f1));
                if (IsWin()){
                    break;
                }

                System.out.println(f1.getName() + " Health: " + fighter1.getHealth());
                System.out.println(f2.getName() + " Health: " + fighter1.getHealth());
                System.out.println(" ");
            }
        }else{
            System.out.println("Boxers weight doesn't match!");
        }
    }

    boolean IsCheck(){
        return (fighter1.getWeight() >= minweight && fighter1.getWeight() <= maxweight) && (fighter2.getWeight() >= minweight && fighter2.getWeight() <= maxweight);
    }

    boolean IsWin(){
        if (fighter1.getHealth() == 0){
            System.out.println(fighter2.getName() + " won!");
            return true;
        }

        if (fighter2.getHealth() == 0){
            System.out.println(fighter1.getName() + " won!");
            return true;
        }
        return false;
    }
}
