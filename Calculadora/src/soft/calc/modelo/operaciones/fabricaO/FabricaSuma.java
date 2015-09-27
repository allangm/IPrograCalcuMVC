/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.calc.modelo.operaciones.fabricaO;

import soft.calc.modelo.operaciones.Operacion;
import soft.calc.modelo.operaciones.Suma;

/**
 *
 * @author curso
 */
public class FabricaSuma extends FabricaOperacion{
    
 @Override
    public Operacion crearOperacion(int pValor1, int pValor2) {
        return new Suma(pValor1, pValor2);
    }
}
