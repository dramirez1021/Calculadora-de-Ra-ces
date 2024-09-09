
package metodosnumericosraices;

import metodosnumericoscomun.IFuncion;

/**
 *
 * @author adria
 */
public class PuntoFijo {
IFuncion f , df;
public PuntoFijo (IFuncion funcion , IFuncion dfuncion){
    f=funcion;
    df= dfuncion;
    
} 
    public double raiz(double xi, double e, int i ){
        double r = Double.NaN;
        int c=-1;
        if (1 > Math.abs(df.eval(xi))){
            while (Math.abs(f.eval(xi)- xi)> e && c < i){
                xi= f.eval(xi);
                c++;
            }
            if (c <= i){
                r = xi;
            }else{
                System.out.println("No se encontro la raiz");
            }
            return r;
            
        }else{
            System.out.println("No se puede evaluar esta funcion");
        }
        return r;
    }

    
    
}
