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
public class Suma extends Operacion implements IOperacion{

    public Suma(int pValor1, int pValor2) {
        super(pValor1, pValor2);
    }

    @Override
    public int calcular() {
        return getValor1() + getValor2();
    }
    
}
