/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meganfizzbuzz;

/**
 *
 * @author Megan
 */
interface Primes { 
    //print out the first 10 prime numbers starting with 1
    public void first10();
    
    //return the Nth prime of the index 
    public int indexedPrime(int index);

   //return all the primes from the Nth (start) to the Xth(end)
    public int[] rangeOfPrimes(int start, int end);

    
}
