public class Ladder implements SnakeAndLadders {

    public int jump(int n) {
        
        if (n == 4) return 14;
        else if (n == 13) return 30;
        else if (n == 33) return 49;
        else if (n == 42) return 63;
        else if (n == 50) return 69;
        else if (n == 62) return 81;
        else if (n == 74) return 92;
        return n; 
    }

    public String snakeOrLadder(int n) {
        if (n == 4 || n == 13 || n == 33 || n == 42 || n == 50 || n == 62 || n == 74) {
            return "ladder";
        } else {
            return "plain";
        }
    }
}

