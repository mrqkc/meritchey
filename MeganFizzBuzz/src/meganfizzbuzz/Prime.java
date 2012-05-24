/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meganfizzbuzz;

/**
 *
 * @author Megan
 */
public class Prime implements Primes{

    @Override
    public void first10() {
        System.out.println("First 10 Prime numbers");
        int count = 1;
        int num = 2;
        while (count<=10){ 
            int x = 0;
            for (int i=2;i<num; i++){
                if((num%i ==0)){
                    x = 1;
                    break;
                }
            }
            if(x==0){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    @Override
    public int indexedPrime(int index) {
        int count = 1;
        int num = 2;
        while (count<=index){ 
            int x = 0;
            for (int i=2;i<num; i++){
                if((num%i ==0)){
                    x = 1;
                    break;
                }
            }
            if(x==0 && count!= index){
                count++;
                break;
            }
            if(count!=index){
            num++;
            }
        }
        return num;
    }

    @Override
    public int[] rangeOfPrimes(int start, int end) {
        int count = 0;
        int num = start;
        int[] range = new int[end-start];
        if(start>end){
            range[0] = -1;
            return range;
        }
            
        while (num<=end){ 
            int x = 0;
            for (int i=2;i<num; i++){
                if((num%i ==0)){
                    x = 1;
                    break;
                }
            }
            if(x==0){
                range[count] = num;
                count++;
                break;
            }
            num++;

        }
        range[count]=-1;
        return range;
    }
}
