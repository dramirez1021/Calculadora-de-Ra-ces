/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericosraices;

import metodosnumericoscomun.IFuncion;

/**
 *
 * @author adria
 */
public class PruebaB {
IFuncion f; 
public PruebaB (IFuncion funcion){
    f=funcion;
}
    public final double raiz(double x0, double x1, double e, int i){  
        double x=Double.NaN;
        int c = -1;
        if (f.eval(x0)*f.eval(x1)< 0){
            do{
                x= (x0+x1)/2;
                if(f.eval(x0)*f.eval(x)<0){
                    x1=x;
                }else{
                    x0=x;
                   
                }
            
            }while(Math.abs(f.eval(x))> e || i == c);
            c++;
        }else{
            System.out.println("No hay cambio de signo");
        }
        return x;
    }
 
    
}
