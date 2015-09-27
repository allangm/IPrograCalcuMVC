/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.calc.modelo.conversiones.fabricaC;

import soft.calc.modelo.conversiones.Conversion;
import soft.calc.modelo.conversiones.ConversionBase;

/**
 *
 * @author curso
 */
public class FabricaConversionBase extends FabricaConversion {
 
    @Override
    public Conversion crearConversion(int pValor1, int pValor2) {
        return new ConversionBase(pValor1, pValor2);
    }


}
