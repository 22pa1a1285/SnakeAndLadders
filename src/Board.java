import java.util.*;

public class Board {
    private int n;
    private Queue<Integer> players;

    public Board(int n,Queue<Integer> players){
        this.n = n;
        this.players = players;
    }

    public void displayScore(HashMap<String,Integer> ls){
        System.out.println(players);
        System.out.println(ls);
    }
}