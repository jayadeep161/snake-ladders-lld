package hostel;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("snake Game");
        Scanner val=new Scanner(System.in);
        System.out.println("Enter size of the board");
        int boardsize=val.nextInt();
        System.out.println("Enter number of snakes");
        int number_snakes= val.nextInt();
        val.nextLine();
        HashMap<Integer,snake> snake_hashmap=new HashMap<>();
        System.out.println("Enter snake head and tail values");
        for (int i=0;i<number_snakes;i++){
            String str[]=val.nextLine().split(" ");
            int head=Integer.parseInt(str[0]);
            int tail=Integer.parseInt(str[1]);
            snake s=new snake(head,tail);
            snake_hashmap.put(head,s);
        }
        System.out.println("Enter number of ladders");

        int number_ladder = val.nextInt();
        val.nextLine();
        System.out.println("Enter ladder  head and tail values");
        HashMap<Integer,ladder> ladder_hashmap=new HashMap<>();
        for (int i=0;i<number_ladder;i++){
            String str1[]=val.nextLine().split(" ");
            int head=Integer.parseInt(str1[0]);
            int tail=Integer.parseInt(str1[1]);
            ladder l=new ladder(head,tail);
            ladder_hashmap.put(head,l);
        }
        System.out.println("Enter number of players");
        int players_count= val.nextInt();
        val.nextLine();
        Queue<Player> playernames=new LinkedList<>();
        System.out.println("Enter player names");
        for (int i=0;i<players_count;i++){

                String name=val.nextLine();
                Player p=new Player(name);
                playernames.add(p);
        }
        Gameboard board=new Gameboard(boardsize,snake_hashmap,ladder_hashmap,playernames);
        board.startgame();
    }
}
