/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraysbidimensionales;

/**
 *
 * @author administrador
 */
public class Ej1AB {
    //Atributos
    private int [] [] Tabla = new int [3] [6]; //3 filas y 6 columnas
    
    //Constructor
    public Ej1AB(){//Cada vez que se cree una instancia de esta clase, tendra 
        //la siguiente estructura
        Tabla [0] [0] = 0;
        Tabla [0] [1] = 30;
        Tabla [0] [2] = 2;
        Tabla [0] [5] = 5;
        Tabla [1] [0] = 75 ;
        Tabla [1] [4] = 0 ;
        Tabla [2] [2] = -2 ;
        Tabla [2] [3] = 9 ;
        Tabla [2] [5] = 11 ;
    }
    
    //Metodo para mostrar por pantalla el vector
    protected void imprime(){
        //Se mostrara fila a fila
        int i = 0;
        while (i<3){
            for (int j = 0; j<6; j++){//Se muestra las 5 columnas
                System.out.print(Tabla[i] [j]+" ");
            }
            i++;//Siguiente fila
            System.out.println();//Salto de linea
        }
    }
}
