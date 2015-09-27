/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.calc.modelo.conversiones.fabricaC;

import soft.calc.modelo.conversiones.Conversion;

/**
 *
 * @author curso
 */
public abstract class FabricaConversion {
    
    public abstract Conversion crearConversion(int pValor1, int pValor2);
}
