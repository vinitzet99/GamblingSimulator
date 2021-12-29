/**
 * @author Vinit Kumar
 * @date 29/12/2021
 * Gambling Problem
 */
package gamblingSimulator;
import java.util.Random;

public class GamblingSimulator {
    //instance variable declaration
    public static final int STAKE=100;
    public static final int BET=1;
    public static Random random=new Random();
    //method to generate Wins or Looses
    public static void betGambling(){
        int value=random.nextInt(2);
        if(value==0){
            System.out.println("Loose !!");
        }
        else{
            System.out.println("Win !!");
        }
    }
    public static void main(String[] args){
        System.out.println("Welcome to Gambling Simulator:");// Welcome Message
        betGambling();// Place a bid
    }
}
