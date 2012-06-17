/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package megansafe;

/**
 *
 * @author Megan
 */
public interface Lock {

//     comboLock 
public boolean unlockCombo(int[] input);
// padlock (keycard)
public boolean unlockPadlock(int idNumber);
//touchscreen
public boolean UnlockTouch(String input);
//relock
public void relock();
    
}
