package BoxingGame;

public class Fighter {
    private String name;
    private int damage;
    private int health;
    private int weight;
    private int dodge;

    public Fighter (final String name, final int damage, final int health, final int weight, final int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

        if (dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    public int hit(Fighter fighter){
        System.out.println(name + " => " + fighter.name + " " + damage + " Damaged!");

        if (fighter.IsDodge()) {
            System.out.println("\t <<=\t\t=>> \t");
            System.out.println(fighter.name + " Blocked the UpComing Damage!");
            System.out.println("\t <<=\t\t=>> \t");
            return fighter.health;
        }

        if (fighter.health - this.damage < 0){
            return 0;
        }

        return fighter.health - damage;
    }

    boolean IsDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= dodge;
    }

    boolean IsHit(){
        int randomNumber = (int) (Math.random() * 100);
        return randomNumber % 2 == 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }
}
