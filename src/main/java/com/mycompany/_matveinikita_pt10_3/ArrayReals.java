package com.mycompany._matveinikita_pt10_3;

import Interficies.Estadistiques;
import java.util.Random;

/**
 * Classe ArrayReals que implementa la interfície Estadistiques 
 * 
 * @author nikita
 */
public class ArrayReals implements Estadistiques {
    /*Declaració d'atriubuts i variables*/
    private double[] elementsReals;
    private final static int NOMBRE_MAXIM = 100 , NOMBRE_MINIM = 0, 
            LONGITUT_PER_DEFECTE = 5;

    /**
     * Constructor per defecte que truca el constructor parametritzat amb una
     * longitut per defecte
     */
    public ArrayReals() {
        this(LONGITUT_PER_DEFECTE);
    }
    
    /**
     * Constructor que rep com a parametre la longitut de la classe  i que a més 
     * assigna els valors reals a cada posició de l'array 
     * @param longitut 
     */
    public ArrayReals(int longitut) {
        /*Comprovem que la longitut no sigui igual o menor a 0*/
        if (longitut <= 0){
            System.out.println("ERROR: S'ha introduït una longitut per l'array incorrecte");
            System.out.println("Es donarà el valor per defecte (5)");
            longitut = LONGITUT_PER_DEFECTE;
        }
        this.elementsReals = new double[longitut];
        this.assignar();
    }
    
    /**
     * Mètode assignar per donar un valor real entre 0 i 100 (double) a cada
     * posició de l'array
     */
    public void assignar(){
        /*Declaració de variables*/
        Random nombreAleatori = new Random();
        
        /*Donem valors a cada posició del array*/
        for (int i = 0; i < elementsReals.length; i++){
            elementsReals[i] = nombreAleatori.nextDouble() * NOMBRE_MAXIM;
            /*Al multiplicar el NOMBRE_MAXIM(100) al Random, fem que el valor
            d'aquest també estigui inclos (en el nostre cas, tots els valors
            entre 0 i 100 amb els seus decimas i ambdos inclosos*/
        }
    }
    
    /**
     * Mètode sobrescrit minim per veure quin és el nombre més petit del Array
     * @return minim
     */
    @Override
    public double minim(){
        /*Declaració de variables*/
        double minim = NOMBRE_MAXIM;
        
        /*Recorrem l'array per determinar el nombre mínim*/
        for (int i = 0; i < elementsReals.length; i++) {
            if (elementsReals[i] < minim){
                minim = elementsReals[i];
            }
        }
        
        /*Retornem el mínim*/
        return minim;
    }
    
    /**
     * Mètode sobrescrit maxim per veure quin és el nombre més gràn del Array
     * @return maxim
     */
    @Override
    public double maxim(){
        /*Declaració de variables*/
        double maxim = NOMBRE_MINIM;
        
        /*Recorrem l'array per determinar el nombre màxim*/
        for (int i = 0; i < elementsReals.length; i++) {
            if (elementsReals[i] > maxim){
                maxim = elementsReals[i];
            }
        }
        
        /*Retornem el màxim*/
        return maxim;
    }
    
    /**
     * Mètode sobrescrit suma per sumar tots els valors de l'array
     * @return suma 
     */
    @Override
    public double suma(){
        /*Declaració de variables*/
        double suma = 0;
        for (int i = 0; i < elementsReals.length; i++) {
            suma = suma + elementsReals[i];
        }
        return suma;
    }
    
    /**
     * Mètode imprimir per mostrar els elements que hi ha dins de l'array
     */
    public void imprimir(){
        String contingutElementsReals = "";
        for (int i = 0; i < elementsReals.length; i++) {
            if (i == (elementsReals.length - 1)){
                /*Donem un format de sortida al últim nombre*/
                contingutElementsReals = contingutElementsReals + elementsReals[i];
            }
            else{
                /*Canviem el fomat per quan no és l'últim nombre*/
                contingutElementsReals = contingutElementsReals + elementsReals[i] + ",";
            }
        }
        /*Mostrem per pantalla el contingut de l'array*/
        System.out.println(contingutElementsReals);
    }
}