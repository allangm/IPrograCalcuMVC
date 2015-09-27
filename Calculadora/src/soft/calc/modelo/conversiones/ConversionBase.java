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
public class ConversionBase extends Conversion implements IConversion{

    public ConversionBase(int pValor, int pBase) {
        super(pValor, pBase);
    }
    
    @Override
    public String convertir() {
        return Integer.toString( getValor(), getBase() );
    }        
}
