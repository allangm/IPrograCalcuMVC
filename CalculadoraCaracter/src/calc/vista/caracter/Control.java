package calc.vista.caracter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import soft.calc.controlador.Controlador;
/**
 *
 * @author Annia
 */
public class Control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador control=new Controlador();
        while (true){
            System.out.println("Bienvenidos al menu");
            for (int indice=0;indice<control.lista().size();indice++){
                int opcion=indice+1;
                System.out.println("Digite" + " " + opcion + " "+ "para" +" " + control.lista().get(indice));
                
            }
            System.out.println("Digite 10 para salir");
 
        Scanner ingresar = new Scanner(System.in);
        int num2;
        int num1;
        String  resultado;
        String operacion = null;
        int opcion=ingresar.nextInt();
        switch(opcion){
            case 1: operacion="Suma"; break;
            case 2: operacion="Resta"; break;
            case 3: operacion="Multiplicación"; break;
            case 4: operacion="División"; break;
            case 5: operacion="Elevar"; break;
            case 6: operacion="Raíz cuadrada";break;
            case 7: operacion="Conversión Binario"; break;
            case 8: operacion="Conversión Octal"; break;
            case 9: operacion="Conversión Hexádecimal"; break;
            case 10: System.exit(0); break;
            default: break;
        }
        
        System.out.println("operacion:  "+operacion);
        
        if(opcion<=5 && opcion >=1){
            System.out.print("ingrese primer numero:  ");
            num1=ingresar.nextInt();
            System.out.print("ingrese segundo numero:  ");
            num2=ingresar.nextInt();
            resultado=control.Calculadora(operacion, num1, num2);
            System.out.println("Resultado ="+ " " + resultado);       
            System.out.println("------------------------------");            
        }
        else if (opcion==6){
            System.out.print("ingrese el numero:  ");
            num1=ingresar.nextInt();
            resultado=control.Radical(operacion, num1);
            System.out.println("Resultado ="+ " " + resultado);       
            System.out.println("------------------------------");               
        }
        else if(opcion<=9 && opcion>=7){
            System.out.print("ingrese el numero:  ");
            num1=ingresar.nextInt();
            resultado=control.Convertidora(operacion, num1);
            System.out.println("Resultado ="+ " " + resultado);       
            System.out.println("------------------------------");             
        }
 
    }
}
}
