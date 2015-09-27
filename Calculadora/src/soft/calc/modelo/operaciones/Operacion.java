/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.calc.modelo.operaciones;

/**
 *
 * @author curso
 */
public abstract class Operacion implements IOperacion {

   
    public int _Valor1;
    public int _Valor2;
    
    //constructor
    
    public Operacion(){
    }
    
    public Operacion(int pValor1, int pValor2){
        _Valor1=pValor1;
        _Valor2=pValor2;
    }
    
    //metodos
    public int getValor1() {
        return _Valor1;
    }

    public void setValor1(int pValor1) {
        _Valor1 = pValor1;
    }

    public int getValor2() {
        return _Valor2;
    }

    public void setValor2(int pValor2) {
        _Valor2 = pValor2;
    }    
    
}
