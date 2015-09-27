/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.calc.controlador;

import java.util.ArrayList;
import soft.calc.modelo.ContextoCalculadora;

/**
 *
 * @author curso
 */
public class Controlador {
    ContextoCalculadora calculadora=new ContextoCalculadora();
    public String resultadoO;
    public String resultadoC;
  
   public ArrayList<String> lista(){
         ArrayList<String> Listaopciones=new ArrayList<String>();
        Listaopciones.add("Suma");
        Listaopciones.add("Resta");
        Listaopciones.add("Multiplicación");
        Listaopciones.add("División");
        Listaopciones.add("Elevar");
        Listaopciones.add("Raíz cuadrada");
        Listaopciones.add("Conversión Binario");
        Listaopciones.add("Conversión Octal");
        Listaopciones.add("Conversión Hexádalecimal");
        return Listaopciones;
   }
    
    public String Calculadora(String opcion,int pvalor1,int pvalor2){
        if (opcion=="Suma"){
            resultadoO=Integer.toString(calculadora.suma(pvalor1, pvalor2));
        }
        if (opcion=="Resta"){
           resultadoO=Integer.toString(calculadora.resta(pvalor1, pvalor2));
        }
        if(opcion=="Multiplicación"){
           resultadoO=Integer.toString(calculadora.multiplica(pvalor1, pvalor2));
        }
        if(opcion=="División"){
            resultadoO=Integer.toString(calculadora.division(pvalor1, pvalor2));
        }
        if(opcion=="Elevar"){
            resultadoO=Integer.toString(calculadora.eleva(pvalor1, pvalor2));
        }

        return resultadoO;    
    }
    
    public String Convertidora(String opcion, int pValor){
        int base=0;;
        if (opcion=="Conversión Hexádalecimal"){
            base=16;
        }
        if(opcion=="Conversión Binario"){
            base=2;
        }
        if(opcion=="Conversión Octal"){
            base=8;
        }
        resultadoC=calculadora.convertir(pValor,base);
        return resultadoC;
    }
    
    public String Radical(String opcion, int pvalor){
        if(opcion.equals("Raíz cuadrada")){
            resultadoO=Integer.toString(calculadora.raiz(pvalor, 2));
            
        }
        return resultadoO;
        
    }
    
}
