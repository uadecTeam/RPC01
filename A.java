/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.util.*;
import java.io.*;

/**
 *
 * @author francisco
 */
public class A {

    public static int x = 0;
    public static int salida = 0;
    

    //<editor-fold defaultstate="collapsed" desc="metodo NOT">
    //    public static int evaluaN( int arrOrdenado[] )
//    {
//        boolean restar = true;
//        
//        int inicio = arrOrdenado[0];
//        
//        int rest = x - inicio; 
//        
//        int siguiente = 0;
//        
//        salida++;
//        
//        
//        
//        if( arrOrdenado.length == 1 )
//            return 1;
//        
//        for( int i = 1 ; i < arrOrdenado.length; i++ )
//        {
//            
//            siguiente = arrOrdenado[i];
//            
//            rest = ( restar )? rest - siguiente : rest ;
//
//            if( ( rest < 0 ) )
//            {
//                restar = false;
//                System.out.println("no suma nada");
//                continue;
//            }
//            
//            System.out.println("si suma");
//            salida++;  
//            
//            
//            
//            
//            
//            
//        }
//           
//        
//        //borrar o modificar estas lineas
//        return salida;
//        
//    }
    //</editor-fold>
    
    public static int evalua( int arrOrdenado[] )
    {
        int ant = arrOrdenado[0];
        int xTemp = x;
        
        xTemp-= arrOrdenado[0];
        
        salida++;
        
        if( arrOrdenado.length == 1 )
            return 1;
        
        for (int i = 1; i < arrOrdenado.length; i++) 
        {
            
            xTemp-= arrOrdenado[i];
            
            if ( xTemp < 0 ) 
                return salida;
            
            salida++;
            xTemp+=ant;
            ant = arrOrdenado[i];
            
                
        }
        
        return salida;
    }
    
    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner( System.in );
        
        
        
        
        int n = entrada.nextInt();
        x = entrada.nextInt();
        
        int arrEntrada[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arrEntrada[i] = entrada.nextInt();
            
        }
        Arrays.sort( arrEntrada );
        int ret = evalua( arrEntrada );
        
        System.out.println(ret);
        
        
    }
    
}
