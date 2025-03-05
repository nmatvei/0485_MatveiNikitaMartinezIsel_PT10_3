/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._matveinikitamartinezisel_pt10_3;

import Interficies.Estadistiques;
import java.util.Random;
/**
 *
 * @author nikita i isel
 */
public class ArrayReals implements Estadistiques {
    /*Declaració d'atriubuts i variables*/
    private double[] arrayReals;
    private final static int LLARGADA_PER_DEFECTE = 10;
    private final static int NOMBRE_MAXIM = 100;

    /**
     * Constructor per defecte
     */
    public ArrayReals() {
        this.arrayReals = new double[LLARGADA_PER_DEFECTE];
    }
    
    /**
     * Constructor que rep com a parametre la llargada de la classe
     * @param llargada 
     */
    public ArrayReals(int llargada) {
        this.arrayReals = new double[llargada];
    }
    
    public void assignar(){
        /*Declaració de variables*/
        Random nombreAleatori = new Random();
        
        /*Donem valors a cada posició del array*/
        for (int i = 0; i < arrayReals.length; i++){
            arrayReals[i] = nombreAleatori.nextDouble() * NOMBRE_MAXIM;
        }
    }
    
    @Override
    public double minim(){
        double minim = 0;
        return minim;
    }
    
    @Override
    public double maxim(){
        double maxim = 0;
        return maxim;
    }
    
    @Override
    public double suma(){
        double suma = 0;
        return suma;
    }
}
