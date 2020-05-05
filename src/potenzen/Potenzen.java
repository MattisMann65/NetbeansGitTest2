
package potenzen;


public class Potenzen {

    
    public static void main(String[] args) {
        System.out.println("" + potenzen(2,-30));
    }
    
    public static double potenzen(int a, int b){
        if(b == 0){
            return 1;
        }
        
        else if(b > 0){
            return potenzen(a, b-1) * a;
        }
        
        else if(b < 0){
            return potenzen(a, b+1) / a;
        }
        return -1;
    }
    
}
