public class Snake implements SnakeAndLadders {
 
    public int jump(int n) {
      
        if (n == 27) return 5;
        else if (n == 40) return 3;
        else if (n == 43) return 18;
        else if (n == 54) return 31;
        else if (n == 66) return 45;
        else if (n == 76) return 58;
        else if (n == 89) return 53;
        else if (n == 99) return 41;
        return n;
    }
  
    
    public String snakeOrLadder(int n){
     
        if (n == 27 || n == 40 || n == 43 || n == 54 || n == 66 || n == 76 || n == 89 || n == 99) {
            return "snake";
        } else if (n == 4 || n == 13 || n == 33 || n == 42 || n == 50 || n == 62 || n == 74) {
            return "ladder";
        } else {
            return "plain";
        }
    }
  }