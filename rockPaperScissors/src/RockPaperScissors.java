
import java.util.Scanner;


public class RockPaperScissors {
    static User person = new User();
    static Computer robot = new Computer();
    public static void main(String[] args) {
        String uName = "";
        String choice = "";
        Scanner inp = new Scanner(System.in);
        System.out.print("What is your name?: ");
        uName = inp.nextLine();
        person.setName(uName);
        System.out.println("Hi "+uName+", it's Very nice to meet you.");
        System.out.println("My name is "+robot.getName()+", your computer opponent.");
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("(R)ock, (P)aper, (S)cissors?.... 0 to end game: ");
        // if you want to force play of game for first time then put these two line into
        // the top of while loop
        choice = inp.nextLine().trim();
        person.setLastChoice(choice);
        while(!choice.equals("0")){
            String userChoice = "",robChoice="";
            userChoice = person.getLastChoice();
            robChoice = robot.getLastChoice();
            userChoice = userChoice.toUpperCase();
            // main game logic 
            if(userChoice.equals(robChoice)){
                System.out.println("It's a tie!");
            }else if(userChoice.equals("R")){
                if(robChoice.equals("S")){
                    System.out.println("Rock Crushes scissors, "+person.getName()+" Wins!");
                    person.increaseWins();
                    robot.increaseLoss();
                }else if(robChoice.equals("P")){
                    System.out.println("Paper eats Rock, "+person.getName()+" Lose!");
                    person.increaseLoss();
                    robot.increaseWins();
                }
            }else if(userChoice.equals("P")){
                if(robChoice.equals("R")){
                    System.out.println("Paper eats Rock. "+person.getName()+" Wins!");
                    person.increaseWins();
                    robot.increaseLoss();
                }else if(robChoice.equals("S")){
                    System.out.println("Scissors cuts Paper, "+person.getName()+" Lose!");
                    person.increaseLoss();
                    robot.increaseWins();
                }
            }else if(userChoice.equals("S")){
                if(robChoice.equals("P")){
                    System.out.println("Scissors cuts Paper, "+person.getName()+" Wins!");
                    person.increaseWins();
                    robot.increaseLoss();
                }else if(robChoice.equals("R")){
                    System.out.println("Rock crushes Scissor, "+person.getName()+" Lose!");
                    person.increaseLoss();
                    robot.increaseWins();
                }
            }else{
                System.out.println("Invalid Entry");
            }
            // uncomment next line to add extra line to clarification.
            // System.out.println("");
            System.out.println("==============+++++++++++++===============");
            System.out.println("(R)ock, (P)aper, (S)cissors?.... 0 to end game: ");
            choice = inp.nextLine().trim();
            person.setLastChoice(choice);
        }
        DisplayResults();
    }
    
   static void DisplayResults(){
        System.out.println("=====================+++++++++++++++====================");
        System.out.println("Here are the result of the game");
        System.out.println(person.getName() + "'s Win Percent "+person.winPercent()+"%");
        System.out.println(robot.getName() + "'s Win Percent "+robot.winPercent()+"%");
        if(person.winPercent() >= robot.winPercent()){
            System.out.println(person.getName()+" Wins the game");
        }else if(person.winPercent() < robot.winPercent()){
            System.out.println(robot.getName()+" Wins the game");
        }
    }
    
}
