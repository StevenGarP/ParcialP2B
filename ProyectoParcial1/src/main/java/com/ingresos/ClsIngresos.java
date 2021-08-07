/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingresos;
import com.Reporte.ClsReporte;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class ClsIngresos {

    /**
     * @return the Descripcion_producto
     */
    public String getDescripcion_producto() {
        return Descripcion_producto;
    }

    /**
     * @param Descripcion_producto the Descripcion_producto to set
     */
    public void setDescripcion_producto(String Descripcion_producto) {
        this.Descripcion_producto = Descripcion_producto;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    /**
     * @return the Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the Peso
     */
    public double getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    /**
     * @return the Descripcion_GValor
     */
    public String getDescripcion_GValor() {
        return Descripcion_GValor;
    }

    /**
     * @param Descripcion_GValor the Descripcion_GValor to set
     */
    public void setDescripcion_GValor(String Descripcion_GValor) {
        this.Descripcion_GValor = Descripcion_GValor;
    }

    /**
     * @return the costoGV
     */
    public double getCostoGV() {
        return costoGV;
    }

    /**
     * @param costoGV the costoGV to set
     */
    public void setCostoGV(double costoGV) {
        this.costoGV = costoGV;
    }

    /**
     * @return the Descripcion_GPeso
     */
    public String getDescripcion_GPeso() {
        return Descripcion_GPeso;
    }

    /**
     * @param Descripcion_GPeso the Descripcion_GPeso to set
     */
    public void setDescripcion_GPeso(String Descripcion_GPeso) {
        this.Descripcion_GPeso = Descripcion_GPeso;
    }

    /**
     * @return the costoGP
     */
    public double getCostoGP() {
        return costoGP;
    }

    /**
     * @param costoGP the costoGP to set
     */
    public void setCostoGP(double costoGP) {
        this.costoGP = costoGP;
    }
    //la variable descripcion de gasto valor se refiere a los gastos que causa el productos por su costo, tales como impuesto, seguros o indemnizaciones
    //la variable descripcion de gasto peso se refiere a los gastos que causa el producto por su peso, tales como su fletes, acarreos y maquinarias para movilizacion
    //la variable descripcion producto es el nombre del producto
    private String Descripcion_producto;
    private int Cantidad;  
    private double Precio;
    private double Peso;
    private String Descripcion_GValor;
    private double costoGV;
    private String Descripcion_GPeso;
    private double costoGP;
    private int cantidad_ingresos;
    private int cantidad_ingresosCValor;
    private int cantidad_ingresosCPeso;
    Scanner Ingreso = new Scanner(System.in);
    
   
    public void IngresoProducto () {
      
        System.out.println("Cuantos Ingresos desea hacer: ");
        setCantidad_ingresos(Ingreso.nextInt());
        for (int i = 1; i <= cantidad_ingresos; i++) {
        //ClsReporte Matrix = new ClsReporte(cantidad_ingresos);      
        System.out.println("Descripcion: ");
        setDescripcion_producto(Ingreso.next());
        System.out.println("Cantidad: ");
        setCantidad(Ingreso.nextInt());
        System.out.println("Precio: ");
        setPrecio(Ingreso.nextDouble());
        System.out.println("Peso");
        setPeso(Ingreso.nextDouble());  
        //Matrix.AgregaReporte2(Cantidad, Descripcion_producto, Precio);
        }
        menu();
        
        
        
    }
    public void IngresoGastoValor () {
        System.out.println("Tiene que hacer un maximo 3 Ingresos de Gastos");
        System.out.println("Si no hay Gasto ponga 0");
        
        System.out.println("Descripcion del Gasto: ");
        setDescripcion_GValor(Ingreso.next());
        System.out.println("Costo del Gasto: ");
        setCostoGV(Ingreso.nextDouble());
        menu();
    }
    public void IngresoGastoPeso () {
        System.out.println("Tiene que hacer un maximo 3 Ingresos de Gastos");
        System.out.println("Si no hay Gasto ponga 0");
        
        System.out.println("Descripcion del Gasto por peso: ");
        setDescripcion_GPeso(Ingreso.next());
        System.out.println("Costo del Gasto por peso");
        setCostoGP(Ingreso.nextDouble());
        menu();
    }
    public void menu(){
        ClsReporte Matrix = new ClsReporte(cantidad_ingresos);
        System.out.println("Ingrese el No. de Factura: ");
        String factura = Ingreso.next();
        
        System.out.println("Ingresos Factura No " + factura);
        
        System.out.println("Menu de Ingreso");
        System.out.println("1) Ingreso Producto: ");
        System.out.println("2) Ingreso de Gasto por valor del producto: ");
        System.out.println("3) Ingreso de Gasto por peso del producto: ");
        System.out.println("4) Reporte");
        System.out.println("Ingrese la Opcion que Desea: ");
        int menu = Ingreso.nextInt();
        
        switch(menu){
            case 1: IngresoProducto ();
            break;
            case 2: IngresoGastoValor ();
            break;
            case 3: IngresoGastoPeso ();
            break;
            
            case 4: 
                for (int x = 1; x <= cantidad_ingresos; x++) {
                  Matrix.AgregaReporte2(getCantidad(), getDescripcion_producto(), getPrecio());
                  Matrix.imprimirDecorado();  
                }
    
            
            break;
        
            default:
        }
        
    }

    /**
     * @return the cantidad_ingresos
     */
    public int getCantidad_ingresos() {
        return cantidad_ingresos;
    }

    /**
     * @param cantidad_ingresos the cantidad_ingresos to set
     */
    public void setCantidad_ingresos(int cantidad_ingresos) {
        this.cantidad_ingresos = cantidad_ingresos;
    }

    /**
     * @return the cantidad_ingresosCValor
     */
    public int getCantidad_ingresosCValor() {
        return cantidad_ingresosCValor;
    }

    /**
     * @param cantidad_ingresosCValor the cantidad_ingresosCValor to set
     */
    public void setCantidad_ingresosCValor(int cantidad_ingresosCValor) {
        this.cantidad_ingresosCValor = cantidad_ingresosCValor;
    }

    /**
     * @return the cantidad_ingresosCPeso
     */
    public int getCantidad_ingresosCPeso() {
        return cantidad_ingresosCPeso;
    }

    /**
     * @param cantidad_ingresosCPeso the cantidad_ingresosCPeso to set
     */
    public void setCantidad_ingresosCPeso(int cantidad_ingresosCPeso) {
        this.cantidad_ingresosCPeso = cantidad_ingresosCPeso;
    }
    
    
}
