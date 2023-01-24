package gamedua;

public class Game {

    public static void main(String[] args) {
        
         Player player1 = new Player("Abdul 1", 10, 100);
         Player player2 = new Player("Jawad 2", 15, 90);
         
        player1.run();
        player2.run();
        
        player1.showStats();
        player2.showStats();
        
        player1.attack(player2);
        player2.defend();
        
        player1.showStats();
        player2.showStats();
        
        System.out.println(player2.getName() + " remaining health: " + player2.getHealthPoint());
        if (player2.isDead()) {
            System.out.println("\n"+player2.getName() + " is dead.");
        } else {
            System.out.println("\n"+player2.getName() + " is still alive.");
        }
        
    }
}
