/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Reporte;

import com.ingresos.ClsIngresos;

/**
 *
 * @author HP
 */
public class ClsReporte {
    ClsIngresos CI = new ClsIngresos();
    
    private String [][] Reporte = new String [CI.getCantidad_ingresos()][7];
    
    private static final int CANTIDAD = 0;
    private static final int DESC_PRODUCTO = 1;
    private static final int VALOR_FACTURA = 2;
    private static final int GVALOR_PRODUCTO = 3; 
    private static final int GPESO_PRODUCTO = 4;
    private static final int COSTO_POR_UNIDAD = 5;
    private static final int COSTO_TOTAL = 6;
    
    private int FilaActual = 0;    
    private final int MAX_FILAS = 4;
    private final int MAX_COLUMNAS  = 7;
    
    private int totalFilas = 0;
    
        public ClsReporte(int filas){
        if (filas > MAX_FILAS){
            throw(new IllegalArgumentException());
        } else {
            totalFilas = filas;
            Reporte = new String[totalFilas][MAX_COLUMNAS];
            }
                
        }


   
        
        /*public String AgregaReporte(ClsIngresos ingresos){
        Reporte[FilaActual][CANTIDAD]= ingresos.getCantidad() + "";
        Reporte[FilaActual][DESC_PRODUCTO]= ingresos.getDescripcion_producto();
        Reporte[FilaActual][VALOR_FACTURA]= ingresos.getPrecio() + "";  
        FilaActual++;
        return "Añadido a la factura:)";     
    }*/
        
        public String AgregaReporte2(int cant, String des_P, double precio){
                Reporte[FilaActual][CANTIDAD]= cant + "";
                Reporte[FilaActual][DESC_PRODUCTO]= des_P;
                Reporte[FilaActual][VALOR_FACTURA]= precio + "";  
                FilaActual++;
            
            return "Añadido a la factura:)";
             
    }
        
        public  void imprimirDecorado(){
       
        for (int x = 0; x < Reporte.length; x++) {
            System.out.print("|");
            for (int y = 0; y < Reporte[x].length; y++) {
                System.out.print(Reporte[x][y]);
                if (y != Reporte[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }

    
}
