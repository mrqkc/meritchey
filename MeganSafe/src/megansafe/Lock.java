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
//    5 digit number to type in to unlock
    public void unlock(int a, int b, int c, int d, int e);
//    auto lock on door shutting
    public void relock();
    
}
