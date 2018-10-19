
public class User {
    private String name;
    private String choice="";
    private float wins = 0;
    private float loss = 0;

    public void setName(String s) {
        name = s;
    }
    public String getName() {
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
    public void setLastChoice(String s){
        choice = s;
    }
    public String getLastChoice(){
        return choice;
    }
    
}
