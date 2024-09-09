
package metodosnumericosraices;

import metodosnumericoscomun.Funcion;
import metodosnumericoscomun.IFuncion;

/**
 *
 * @author adria
 */
public class NewtonRapson { 
IFuncion f , df; 
public NewtonRapson (IFuncion funcion, IFuncion dfuncion){
    f=funcion;
    df=dfuncion;
}

   
    public double raiz( double xi, double e, int i ){
        double r= Double.NaN;
        int c=-1;
        while(Math.abs(f.eval(xi))> e &&  c < i){
            xi= xi - (f.eval(xi)/df.eval(xi));
            c++;
        }
        if (c < i) {
             r=xi;
        }else {
            System.out.println("No se encontro la raiz");
        }
        return r;
                  
    }
}