/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericoscomun;

import com.bestcode.mathparser.IMathParser;
import com.bestcode.mathparser.MathParserFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adria
 */
public class Funcion implements IFuncion{
    private String definicion ;
    private IMathParser parser = MathParserFactory.create();
    public Funcion(String def){
         definicion=def;
         parser.setExpression(definicion);
    }

  
    @Override
    public double eval(double x) {
        double resultado = Double.NaN;
        parser.setX(x);
        try {
            resultado = parser.getValue();
                    } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return resultado;
       
    }
    
}
