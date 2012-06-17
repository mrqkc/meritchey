/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package megansafe;

/**
 *
 * @author Megan
 */
public class MeganSafe implements Lock, InsideSafe{
//ComboLock unlocking
    boolean opened=false;
    //    store combo
     int[] combo = {5,24,1};
     int[] idNumbers= {123456, 654321, 246801};
     String password= "MeganPassword";
     String myLoot= "You have found me treasure.";
    @Override
    public boolean unlockCombo(int[] input){
        int numbersCorrect = 0;
        if(input.length>3){
            return opened;
        }
        for(int i = 0; i<input.length; i++){
            if(combo[i]==input[i]){
                numbersCorrect++;
            }
        }
        if(numbersCorrect==3){
            opened=true;
        }
        return opened;
    }
    
//    Padlock (keycard)
    @Override
    public boolean unlockPadlock(int idNumber){
        for(int i = 0; i<idNumbers.length; i++){
            if(idNumber==idNumbers[i]){
            opened=true;
            break;
            }
        }
        return opened;
    }
    
//    Touchscreen
    public boolean unlockTouch(String input){
        if (input.contentEquals(password)){
            opened=true;
        }
        return opened;
    }
    
//    Relock for all
    @Override
    public void relock(){
        opened=false;
    }
    
//    Contents
    @Override
    public String GetContents(){
        if (opened){
            return myLoot;
        }
        return ("You failed!");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
