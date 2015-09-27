/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.calc.modelo.operaciones.fabricaO;

import soft.calc.modelo.operaciones.Operacion;
import soft.calc.modelo.operaciones.Resta;

/**
 *
 * @author curso
 */
public class FabricaResta extends FabricaOperacion{
    
@Override
    public Operacion crearOperacion(int pValor1, int pValor2) {
        return new Resta(pValor1, pValor2);
    }
}
