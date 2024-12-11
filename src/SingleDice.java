import java.util.*;
import java.math.*;

public class SingleDice implements Dice {
    private int result;
    public int roll() {
        return (int) (Math.random() * 6) + 1; 
    }
    public int get(){
        int b=roll();
        if(b==6){
            b+=roll();
        }if(b==12){
            b+=roll();
        }if(b==18){
            b=0;
        }
        return b;
    }
    public int getResult(){
        this.result=get();
        return result;
    }
}
