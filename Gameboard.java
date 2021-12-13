package hostel;

import java.util.HashMap;
import java.util.Queue;

public class Gameboard {
    private  int boardsize;
    private HashMap<Integer,snake> snake_hashmap;
    private HashMap<Integer,ladder> ladder_hashmap;
    private Queue<Player>playernames;
    private Dice dice;
    Gameboard(int boardsize,HashMap<Integer,snake>snake_hashmap,HashMap<Integer,ladder>ladder_hashmap,
              Queue<Player> playernames){
        this.boardsize=boardsize;
        this.snake_hashmap=snake_hashmap;
        this.ladder_hashmap=ladder_hashmap;
        this.playernames=playernames;
        dice=new Dice();
    }
    void startgame(){
        while(true){
            Player p=playernames.poll();
            int pos=p.getLocation();
            pos=pos+ dice.diceroll();
            if (snake_hashmap.containsKey(pos)){
                snake s=snake_hashmap.get(pos);
                p.setLocation(s.getTail());
                System.out.println("The player at"+p.getName()+"caught by snake at"+pos+"and moved to"+p.getLocation());
            }
            else if (ladder_hashmap.containsKey(pos)){
                ladder l=ladder_hashmap.get(pos);
                p.setLocation(l.getTail());
                System.out.println("The player at"+p.getName()+"climbed a ladder at"+pos+"and moved to"+p.getLocation());
            }
            else if(pos>boardsize) {
                continue;
            }

            else{
                p.setLocation(pos);
                System.out.println("The player"+p.getName()+"has moved to "+p.getLocation());
            }
            if (pos==boardsize){
                System.out.println("The player"+p.getName()+"has won");
                break;
            }
            playernames.add(p);
        }
    }
}
