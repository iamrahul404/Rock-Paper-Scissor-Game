
import java.util.Random;


public class Computer {
    private final String name = "Bob";
    private String choice="";
    private float wins = 0;
    private float loss = 0;
    Random generator = new Random();
    String getName() {
       return name;
    }
    public void increaseWins(){
        wins++;
    }
    public void increaseLoss(){
        loss++;
    }
    public float winPercent(){
        float per = 0;
        per = (wins/(wins+loss))*100;
        return per;
    }
    
    public String getLastChoice(){
        int x = 0;
        // you also can use Random if wants comment next line and uncomment next to next line
         x = (int) (Math.random() * 3 + 1);
        // x = generator.nextInt(3)+1;
        if(x==1){
            choice = "R";
        }else if(x==2){
            choice = "P";
        }else if(x==3){
            choice = "S";
        }
        return choice;
    }
    
}
