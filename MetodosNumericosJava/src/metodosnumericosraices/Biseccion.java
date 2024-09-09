
package metodosnumericosraices;

import metodosnumericoscomun.IFuncion;

/**
 *
 * @author adria
 */
public class Biseccion {
   
IFuncion f; 
public Biseccion (IFuncion funcion){
    f=funcion;
}
    public final double raiz(double x0, double x1, double t){  
        double x=Double.NaN;
        if (f.eval(x0)*f.eval(x1)< 0){
            do{
                x= (x0+x1)/2;
                if(f.eval(x0)*f.eval(x)<0){
                    x1=x;
                }else{
                    x0=x;
                   
                }
            }while(Math.abs(f.eval(x))> t);
            
        }else{
            System.out.println("No hay cambio de signo");
        }
        return x;
    }
 
    
}
