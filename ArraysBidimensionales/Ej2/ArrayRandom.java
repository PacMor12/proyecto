/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraysbidimensionales;

/**
 *
 * @author administrador
 */
public class ArrayRandom {
    //Atributos
    private int [] [] Tabla = new int [4] [5];
    
    //Metodo para generar numeros aleatorios
    private int generar(){
        int num = (int) (Math.random ()*899+100);//Numeros entre 100 y 999
        return num;
    }
    
    //Metodo para generar todo un array a base de numeros aleatorios
    protected void crearVector(){
        //Vamos fila por fila
        int fila = 0;
        while (fila < 4){
            for (int col = 0; col < 5; col++){//selecciona cada columna
                Tabla [fila] [col] = this.generar();
                System.out.print(Tabla [fila] [col]+" ");//Se muestra en pantalla
            }
            fila++;//Siguiente fila
            System.out.println();//Salto de linea
        }
    }
             
}
