package gamedua;

public class Battle {
    
    public void start(Player player1, Player player2){
        
        while(!player1.isDead() && !player2.isDead()){
            player1.attack(player2);
            player2.defend();
            System.out.println("");
            
            if (player2.isDead()) {
                System.out.println(player2.getName() + " Is dead.\n"+player1.getName()+" Wins!");
                break;
            }
            
            player2.attack(player1);
            player1.defend();
            System.out.println("");
            if (player1.isDead()) {
                System.out.println(player1.getName() + " Is dead.\n"+player2.getName()+" Wins!");
                break;
            }
        }
    }
}
