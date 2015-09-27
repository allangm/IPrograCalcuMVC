/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.calc.modelo.conversiones;

/**
 *
 * @author curso
 */
public abstract class Conversion implements IConversion {

  
    private int _Valor;
    private int _Base;
    
    //constructor
    public Conversion(int pValor, int pBase){
        _Valor=pValor;
        _Base=pBase;
    }
    
    public int getValor() {
        return _Valor;
    }

    public void setValor(int pValor) {
        _Valor = pValor;
    }

    public int getBase() {
        return _Base;
    }

    public void setBase(int pBase) {
        _Base = pBase;
    }    
}
