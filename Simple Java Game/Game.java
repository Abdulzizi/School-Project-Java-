package gamedua;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Enter player1 name: ");
        String player1Name = scanner.nextLine();
        System.out.print("Enter player1 speed: ");
        int player1Speed = scanner.nextInt();
        System.out.print("Enter player1 health point: ");
        int player1HealthPoint = scanner.nextInt();
        
        Player player1 = new Player(player1Name, player1Speed, player1HealthPoint);
        System.out.println("");
        
        scanner.nextLine(); // Kalo Ga ada Input Player 2 name dan player 2 speed numpuk
        
        System.out.print("Enter player2 name: ");
        String player2Name = scanner.nextLine();
        System.out.print("Enter player2 speed: ");
        int player2Speed = scanner.nextInt();
        System.out.print("Enter player2 health point: ");
        int player2HealthPoint = scanner.nextInt();
        
        Player player2 = new Player(player2Name, player2Speed, player2HealthPoint);
        
        player1.showStats();
        player2.showStats();
        
        Battle battle = new Battle();
        battle.start(player1, player2);
        
         player1.showStats();
         player2.showStats();
        
    }
}
