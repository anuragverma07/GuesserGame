import java.util.*;

import javax.lang.model.util.ElementScanner14;
class LanuchGame{
    public static void main(String args[])
    {
        System.out.println("Let's Start the game ");
        umpire u=new umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}


class Guesser
{
    int guessNum;
     int guessingNumber()
     {
       
    Scanner scan=new Scanner(System.in);
    System.out.println("Guesser! please guess the number.");
    guessNum=scan.nextInt();
    return guessNum;
     }
    {

    }
}

class player
{
    int guessNum;
  int  guessingnumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player! please guess the number.");
        guessNum=scan.nextInt();
        return guessNum;
    }
}
class umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectNumFromGuesser()
    {
Guesser g= new Guesser();
numFromGuesser= g.guessingNumber();
    }
    void collectNumFromPlayers()
    {
        player p1=new player();
        player p2=new player();
        player p3=new player();
        numFromPlayer1=p1.guessingnumber();
        numFromPlayer2=p2.guessingnumber();
        numFromPlayer3=p3.guessingnumber();
    }

void compare()
{
if(numFromGuesser==numFromPlayer1)
{
    if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer2)
    {
        System.out.println("all players have won the game");
    }
    else if (numFromGuesser==numFromPlayer2)
    {
        System.out.println(" both player 1 and player 2 won the game");
    }
    else if (numFromGuesser==numFromPlayer3)
    {
        System.out.println(" both player 1 and player 3 won the game");
    }
    else 
    {
        System.out.println("player 1 won the game");
    }
   
}
else if(numFromGuesser==numFromPlayer2)
{
    if(numFromGuesser==numFromPlayer3)
    {
        System.out.println(" player 2 and player 3 won the game ");
    }
    else 
    {
        System.out.println("player 2 won the game");
    }
    
}
else if(numFromGuesser==numFromPlayer3)
{
    System.out.println("player 3 won the game");

}
else 
{
    System.out.println("No one won the game : Game Over ");
}
}
}
