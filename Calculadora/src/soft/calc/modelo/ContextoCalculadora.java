/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.calc.modelo;

import soft.calc.modelo.conversiones.Conversion;
import soft.calc.modelo.conversiones.fabricaC.FabricaConversion;
import soft.calc.modelo.conversiones.fabricaC.FabricaConversionBase;
import soft.calc.modelo.operaciones.Operacion;
import soft.calc.modelo.operaciones.fabricaO.FabricaDivision;
import soft.calc.modelo.operaciones.fabricaO.FabricaElevar;
import soft.calc.modelo.operaciones.fabricaO.FabricaMultiplicacion;
import soft.calc.modelo.operaciones.fabricaO.FabricaOperacion;
import soft.calc.modelo.operaciones.fabricaO.FabricaRaiz;
import soft.calc.modelo.operaciones.fabricaO.FabricaResta;
import soft.calc.modelo.operaciones.fabricaO.FabricaSuma;


/**
 *
 * @author curso
 */
public class ContextoCalculadora {

    public FabricaOperacion fabricaOpe;
    public Operacion _Operacion;
    public FabricaConversion fabricaConv;
    public Conversion _Conversion;
    
    public ContextoCalculadora(){
        fabricaOpe=null;    
        fabricaConv=null;
   }
    
    public int division(int pvalor1,int pvalor2){
        fabricaOpe= new FabricaDivision();
        _Operacion=fabricaOpe.crearOperacion(pvalor1, pvalor2);
        return _Operacion.calcular();      
    }
    
    public int eleva(int pvalor1,int pvalor2){
        fabricaOpe=new FabricaElevar();
        _Operacion=fabricaOpe.crearOperacion(pvalor1, pvalor2);
        return _Operacion.calcular();
    }
    
    public int multiplica(int pvalor1,int pvalor2){
        fabricaOpe=new FabricaMultiplicacion();
        _Operacion=fabricaOpe.crearOperacion(pvalor1, pvalor2);
        return _Operacion.calcular();
    }
            
    public int suma(int pvalor1,int pvalor2){
        fabricaOpe=new FabricaSuma();
        _Operacion=fabricaOpe.crearOperacion(pvalor1, pvalor2);
        return _Operacion.calcular();
    }
    
    public int resta(int pvalor1,int pvalor2){
        fabricaOpe=new FabricaResta();
        _Operacion=fabricaOpe.crearOperacion(pvalor1, pvalor2);
        return _Operacion.calcular();
    }
    
    public int raiz(int pvalor, int radical){
        fabricaOpe = new FabricaRaiz();
        _Operacion=fabricaOpe.crearOperacion(pvalor, radical);
        return _Operacion.calcular();
    }
 
    public String convertir(int pvalor,int pbase){
        fabricaConv= new FabricaConversionBase();
        _Conversion=fabricaConv.crearConversion(pvalor, pbase);
        return _Conversion.convertir();  
    }

    
}
