/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meganfizzbuzz;

/**
 *
 * @author Megan
 */
public class MeganFizzBuzz implements FizzBuzz{
    @Override
    public void fizz(){
        System.out.println("First 10 multiples of 3");
        for (int i=1; i<11; i++){
            System.out.println (i*3);
        }
    }
    @Override
    public void buzz(){
        System.out.println("First 10 multiples of 5");
        for (int i=1; i<11; i++){
            System.out.println(i*5);
        }
    }
    @Override
    public void fizzbuzz(){
        System.out.println("First 10 multiples of 3 and 5");
        for (int i=1; i<11; i++){
            System.out.println(i*5*3);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here  
    }
}
