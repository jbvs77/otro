
package luisgomez03.pkg22;


public class operaciones {    
    public double total;
    
    public double suma (double nm1, double nm2){
        total = nm1 + nm2;
        return total;
    }
    
    public void resta (double nm1, double nm2){
        total = nm1 - nm2; 
        System.out.println("la resta es: " + total);
    }
    
    public double mult(double nm1, double nm2){
        total= nm1 * nm2;
        return total;
    }
    
    public void div (double nm1, double nm2){
        total = nm1 / nm2; 
        System.out.println("la division es: " + total);
    }
    
    public double modulo (double nm1, double nm2){
        total= nm1 % nm2;
        return total;   
    }
    

}
