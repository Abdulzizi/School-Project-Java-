package gamedua;

class Player {
    private String name;
    private int speed;
    private int healthPoint;
    private int attackDamage;
    private int armor;
    
    public Player(String name, int speed, int healthPoint) {
        this.name = name;
        this.speed = speed;
        this.healthPoint = healthPoint;
        this.attackDamage = 10; // default attack damage
        this.armor = 5; // default armor
    }
    
    public void run() {
        System.out.println(name + " Berlari Dengan kecepatan " + speed);
    }
    
    public boolean isDead() {
        if (healthPoint <= 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void attack(Player target) {
        System.out.println(name + " Menyerang " + target.name + " dengan damage " + attackDamage);
        target.healthPoint -= attackDamage;
    }
    
    public void defend() {
        System.out.println(name + " MengDefense dengan " + armor+" Point Armor");
    }
    
    public String getName() {
        return name;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public int getHealthPoint() {
        return healthPoint;
    }
    
    public int getAttackDamage() {
        return attackDamage;
    }
    
    public int getArmor() {
        return armor;
    }
    public void showStats() {
        System.out.println("\n"+name + " stats:");
        System.out.println("Speed: " + speed);
        System.out.println("Health Point: " + healthPoint);
        System.out.println("Attack Damage: " + attackDamage);
        System.out.println("Armor: " + armor+"\n");
    }
}
    
